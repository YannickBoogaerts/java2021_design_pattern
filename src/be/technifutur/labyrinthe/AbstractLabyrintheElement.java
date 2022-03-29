package be.technifutur.labyrinthe;

import be.technifutur.labyrinthe.visitor.LabyrintheVisitor;

public abstract class AbstractLabyrintheElement {

    private LabyrinthePosition position;

    public LabyrinthePosition getPosition() {
        return position;
    }

    public void setPosition(LabyrinthePosition position) {
        this.position = position;
    }


}
