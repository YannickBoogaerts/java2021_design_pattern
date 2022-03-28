package be.technifutur.labyrinthe.chateau;

import be.technifutur.labyrinthe.LabyrintheFactory;
import be.technifutur.labyrinthe.Mur;
import be.technifutur.labyrinthe.Piece;
import be.technifutur.labyrinthe.Porte;

public class ChateauFactory implements LabyrintheFactory {
    @Override
    public Mur createMur() {
        return new MurChateau();
    }

    @Override
    public Porte createPorte() {
        return new PorteChateau();
    }

    @Override
    public Piece createPiece() {
        return new PieceChateau();
    }
}
