package be.technifutur.labyrinthe.jardin;

import be.technifutur.labyrinthe.LabyrintheFactory;
import be.technifutur.labyrinthe.Mur;
import be.technifutur.labyrinthe.Piece;
import be.technifutur.labyrinthe.Porte;

public class JardinFactory implements LabyrintheFactory {
    @Override
    public Mur createMur() {
        return new Haie();
    }

    @Override
    public Porte createPorte() {
        return new Barrière();
    }

    @Override
    public Piece createPiece() {
        return new Pelouse();
    }
}
