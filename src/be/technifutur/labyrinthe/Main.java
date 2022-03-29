package be.technifutur.labyrinthe;

import be.technifutur.labyrinthe.builder.ArrayLabyrintheBuilder;
import be.technifutur.labyrinthe.chateau.ChateauFactory;
import be.technifutur.labyrinthe.file.LabyrintheFileReader;
import be.technifutur.labyrinthe.jardin.JardinFactory;
import be.technifutur.labyrinthe.visitor.Joueur;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LabyrintheFactory factory = getFactory("Chateau");

        ArrayLabyrintheBuilder builder = new ArrayLabyrintheBuilder();
        LabyrintheFileReader fileReader = new LabyrintheFileReader();
        fileReader.read(new File("lab1.txt"), builder, factory);

        Labyrinthe laby = builder.getLabyrinthe();

        Scanner scan = new Scanner(System.in);
        Joueur joueur = new Joueur(laby);
        do {
            System.out.println("direction (n,e,s,o): ");
            Direction d = switch (scan.nextLine()) {
                case "n" -> Direction.NORD;
                case "e" -> Direction.EST;
                case "s" -> Direction.SUD;
                case "o" -> Direction.OUEST;
                default -> null;
            };
            if (d != null) {
                joueur.move(d);
            }
        } while (! joueur.isFinish());

        System.out.println("gagné");
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
