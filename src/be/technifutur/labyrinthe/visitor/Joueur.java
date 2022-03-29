package be.technifutur.labyrinthe.visitor;

import be.technifutur.labyrinthe.*;

public class Joueur implements LabyrintheVisitor{

    private Labyrinthe game;
    private LabyrintheElement state;

    public Joueur(Labyrinthe game) {
        this.game = game;
        this.state = game.getEntry();
    }

    public void move(Direction d){
        LabyrintheElement element = game.getElement(state, d);
        element.accepteVisiteur(this);
    }

    public boolean isFinish(){
        return state instanceof Porte;
    }

    @Override
    public void visiteMur(Mur mur) {
        System.out.println(mur.getDescription());

    }

    @Override
    public void visitePiece(Piece piece) {
        System.out.println("je me déplace : "+piece.getDescription());
        state = piece;
    }

    @Override
    public void visitePorte(Porte porte) {
        System.out.println("j'ai enfin trouvé la sortie");
        state = porte;
    }
}
