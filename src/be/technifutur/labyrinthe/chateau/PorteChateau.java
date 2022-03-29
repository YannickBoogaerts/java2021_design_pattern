package be.technifutur.labyrinthe.chateau;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.Porte;
import be.technifutur.labyrinthe.visitor.LabyrintheVisitor;

public class PorteChateau extends AbstractLabyrintheElement implements Porte {
    @Override
    public String getDescription() {
        return "Porte de chateau";
    }

    @Override
    public void accepteVisiteur(LabyrintheVisitor visitor) {
        visitor.visitePorte(this);
    }
}
