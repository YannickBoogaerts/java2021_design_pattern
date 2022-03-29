package be.technifutur.labyrinthe.chateau;

import be.technifutur.labyrinthe.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.LabyrinthePosition;
import be.technifutur.labyrinthe.Mur;
import be.technifutur.labyrinthe.visitor.LabyrintheVisitor;

public class MurChateau extends AbstractLabyrintheElement implements Mur {
    @Override
    public String getDescription() {
        return "Mur de chateau";
    }

    @Override
    public void accepteVisiteur(LabyrintheVisitor visitor) {
        visitor.visiteMur(this);
    }


}
