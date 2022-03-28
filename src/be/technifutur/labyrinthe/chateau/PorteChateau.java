package be.technifutur.labyrinthe.chateau;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Porte;

public class PorteChateau extends AbstractLabyrintheElement implements Porte {
    @Override
    public String getDescription() {
        return "Porte de chateau";
    }
}
