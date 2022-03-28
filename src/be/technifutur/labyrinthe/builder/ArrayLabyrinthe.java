package be.technifutur.labyrinthe.builder;

import be.technifutur.labyrinthe.Direction;
import be.technifutur.labyrinthe.Labyrinthe;
import be.technifutur.labyrinthe.LabyrintheElement;
import be.technifutur.labyrinthe.LabyrinthePosition;

public class ArrayLabyrinthe implements Labyrinthe {

    private final LabyrintheElement[][] grille;
    private LabyrinthePositionImpl entry;

    public ArrayLabyrinthe(int nbLine, int nbColumn) {
        grille = new LabyrintheElement[nbLine][nbColumn];
        entry = new LabyrinthePositionImpl(0,0);
    }

    void addElement(LabyrintheElement element, int line, int column) {
        grille[line][column]=element;
        element.setPosition(new LabyrinthePositionImpl(line,column));
    }

    void setEntry(int line, int column) {
        this.entry = new LabyrinthePositionImpl(line,column);
    }

    @Override
    public LabyrintheElement getEntry() {
        return grille[entry.getLine()][entry.getColumn()];
    }

    @Override
    public LabyrintheElement getElement(LabyrintheElement element, Direction direction) {
        LabyrinthePosition destination = element.getPosition().getPosition(direction);
        return grille[destination.getLine()][destination.getColumn()];
    }
}
