package be.technifutur.labyrinthe.chateau;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Piece;

public class PieceChateau extends AbstractLabyrintheElement implements Piece {
    @Override
    public String getDescription() {
        return "Piece de chateau";
    }
}
