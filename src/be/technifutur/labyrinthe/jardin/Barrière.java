package be.technifutur.labyrinthe.jardin;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Porte;

public class Barrière extends AbstractLabyrintheElement implements Porte {
    @Override
    public String getDescription() {
        return "Barrière : mur de jardin";
    }
}
