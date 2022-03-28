package be.technifutur.labyrinthe.jardin;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Mur;

public class Haie extends AbstractLabyrintheElement implements Mur {
    @Override
    public String getDescription() {
        return "Haie : mur de Jardin";
    }
}
