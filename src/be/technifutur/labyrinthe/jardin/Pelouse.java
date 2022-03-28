package be.technifutur.labyrinthe.jardin;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Piece;

public class Pelouse extends AbstractLabyrintheElement implements Piece {
    @Override
    public String getDescription() {
        return "Pelouse : Piece de Jardin";
    }
}
