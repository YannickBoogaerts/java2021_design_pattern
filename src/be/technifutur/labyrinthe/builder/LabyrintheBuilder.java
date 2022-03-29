package be.technifutur.labyrinthe.builder;

import be.technifutur.labyrinthe.Labyrinthe;
import be.technifutur.labyrinthe.LabyrintheFactory;

public interface LabyrintheBuilder {

    void begin(int nbLig, int nbCol, LabyrintheFactory factory);
    void addMur(int lig, int col);
    void addPorte(int lig, int col);
    void addPiece(int lig, int col);
    void setEntry(int lig, int col);
    void end();
}
