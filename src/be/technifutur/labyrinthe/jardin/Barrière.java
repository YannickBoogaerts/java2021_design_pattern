package be.technifutur.labyrinthe.jardin;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Porte;
import be.technifutur.labyrinthe.visitor.LabyrintheVisitor;

public class Barrière extends AbstractLabyrintheElement implements Porte {
    @Override
    public String getDescription() {
        return "Barrière : mur de jardin";
    }

    @Override
    public void accepteVisiteur(LabyrintheVisitor visitor) {
        visitor.visitePorte(this);
    }
}
