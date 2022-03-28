package be.technifutur.labyrinthe.file;

import be.technifutur.labyrinthe.LabyrintheFactory;
import be.technifutur.labyrinthe.builder.LabyrintheBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LabyrintheFileReader {

    void read(File file, LabyrintheBuilder builder, LabyrintheFactory factory) {
        try (Scanner scan = new Scanner(file)) {
            ArrayList<String> list = new ArrayList<>();
            int nbLine = 0;
            int nbCol = 0;
            while (scan.hasNextLine()) {
                nbLine++;
                String s = scan.nextLine();
                if (s.length() > nbCol) {
                    nbCol = s.length();
                }
                list.add(s);
            }
            builder.begin(nbLine, nbCol, factory);
            for (int lig = 0; lig < list.size(); lig++) {
                String s = list.get(lig);
                for (int col = 0; col < s.length(); col++) {
                    switch (s.charAt(col)) {
                        case ' ' -> {
                            builder.addPiece(lig, col);
                        }
                        case 'p' -> {
                            builder.addPorte(lig, col);
                        }
                        case 'm' -> {
                            builder.addMur(lig, col);
                        }
                    }
                }
            }
            builder.end();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
