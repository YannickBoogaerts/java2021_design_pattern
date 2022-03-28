package be.technifutur.labyrinthe;

import be.technifutur.labyrinthe.chateau.ChateauFactory;
import be.technifutur.labyrinthe.jardin.JardinFactory;

public class Main {

    public static void main(String[] args) {
        LabyrintheFactory factory = getFactory("Chateau");

        System.out.println(factory.createMur().getDescription());
        System.out.println(factory.createPiece().getDescription());
        System.out.println(factory.createPorte().getDescription());
    }

    private static LabyrintheFactory getFactory(String type) {
        LabyrintheFactory factory=null;
        switch (type){
            case "Chateau":
                factory = new ChateauFactory();
                break;
            case "Jardin":
                factory = new JardinFactory();
                break;
        }
        return factory;
    }
}
