package be.technifutur.labyrinthe.visitor;

import be.technifutur.labyrinthe.Mur;
import be.technifutur.labyrinthe.Piece;
import be.technifutur.labyrinthe.Porte;

public interface LabyrintheVisitor {

    void visiteMur(Mur mur);
    void visitePiece(Piece piece);
    void visitePorte(Porte porte);
}
