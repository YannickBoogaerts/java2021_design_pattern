package be.technifutur.labyrinthe;

import be.technifutur.labyrinthe.LabyrinthePosition;

public interface LabyrintheElement {

    String getDescription();

    LabyrinthePosition getPosition();

    void setPosition(LabyrinthePosition position);
}
