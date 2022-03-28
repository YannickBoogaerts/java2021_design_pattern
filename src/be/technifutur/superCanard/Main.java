package be.technifutur.superCanard;

public class Main {

    public static void main(String[] args) {
        ComportementVol volerAvecAile;
        ComportementVol nePasVoler;
        ComportementCanCan cancan ;
        ComportementCanCan coincoin;
        ComportementCanCan canardMuet;

        //initiatisation des Comportements
        {
             volerAvecAile = () -> "Je vole avec des ailes";
             nePasVoler = () -> "Je ne vole pas";
             cancan = () -> "Cancan";
             coincoin = () -> "Coincoin";
             canardMuet = () -> "...";
        }

        Canard[] mare = new Canard[]{
                new Colvert(coincoin,volerAvecAile),
                new Mandarin(cancan,volerAvecAile),
                new CanardEnPlastique(coincoin,nePasVoler),
                new Leurre(canardMuet,nePasVoler)
        };

        for (Canard c : mare){
            System.out.println(c.nager());
            System.out.println(c.afficher());
            System.out.println(c.cancaner());
            System.out.println(c.voler());
        }

        for (Canard c : mare){
            c.setComportementCancan(new Begayer(c.getComportementCancan()));
            System.out.println(c.nager());
            System.out.println(c.afficher());
            System.out.println(c.cancaner());
            System.out.println(c.voler());
        }
    }
}
