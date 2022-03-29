package be.technifutur.labyrinthe.chateau;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Piece;
import be.technifutur.labyrinthe.visitor.LabyrintheVisitor;

public class PieceChateau extends AbstractLabyrintheElement implements Piece {
    @Override
    public String getDescription() {
        return "Piece de chateau";
    }

    @Override
    public void accepteVisiteur(LabyrintheVisitor visitor) {
        visitor.visitePiece(this);
    }
}
