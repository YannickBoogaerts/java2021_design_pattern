package be.technifutur.labyrinthe.builder;

import be.technifutur.labyrinthe.LabyrintheElement;

public interface Labyrinthe {

    LabyrintheElement getEntry();
    LabyrintheElement getElement(LabyrintheElement element,Direction direction);

}
