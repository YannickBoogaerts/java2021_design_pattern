package be.technifutur.labyrinthe;

public interface Labyrinthe {

    LabyrintheElement getEntry();
    LabyrintheElement getElement(LabyrintheElement element, Direction direction);

}
