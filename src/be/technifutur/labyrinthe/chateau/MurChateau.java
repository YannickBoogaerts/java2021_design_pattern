package be.technifutur.labyrinthe.chateau;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.LabyrinthePosition;
import be.technifutur.labyrinthe.Mur;

public class MurChateau extends AbstractLabyrintheElement implements Mur {
    @Override
    public String getDescription() {
        return "Mur de chateau";
    }
}
