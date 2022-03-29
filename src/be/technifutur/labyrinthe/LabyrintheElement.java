package be.technifutur.labyrinthe;

import be.technifutur.labyrinthe.LabyrinthePosition;
import be.technifutur.labyrinthe.visitor.LabyrintheVisitor;

public interface LabyrintheElement {

    String getDescription();

    LabyrinthePosition getPosition();

    void setPosition(LabyrinthePosition position);

    void accepteVisiteur(LabyrintheVisitor visitor);
}
