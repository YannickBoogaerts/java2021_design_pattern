package be.technifutur.labyrinthe.jardin;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Mur;
import be.technifutur.labyrinthe.visitor.LabyrintheVisitor;

public class Haie extends AbstractLabyrintheElement implements Mur {
    @Override
    public String getDescription() {
        return "Haie : mur de Jardin";
    }

    @Override
    public void accepteVisiteur(LabyrintheVisitor visitor) {
        visitor.visiteMur(this);
    }
}
