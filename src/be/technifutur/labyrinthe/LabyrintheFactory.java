package be.technifutur.labyrinthe;

public interface LabyrintheFactory {
    Mur createMur();
    Porte createPorte();
    Piece createPiece();

}
