package be.technifutur.labyrinthe.jardin;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Piece;
import be.technifutur.labyrinthe.visitor.LabyrintheVisitor;

public class Pelouse extends AbstractLabyrintheElement implements Piece {
    @Override
    public String getDescription() {
        return "Pelouse : Piece de Jardin";
    }

    @Override
    public void accepteVisiteur(LabyrintheVisitor visitor) {
        visitor.visitePiece(this);
    }
}
