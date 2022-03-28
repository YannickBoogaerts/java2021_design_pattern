package be.technifutur.singleton;

public class Mare {
    private static Mare mare = null;

    private Mare(){}

    public static Mare getMare(){
        if (mare == null) {
            mare = new Mare();
            //TODO initialiser la mare
        }
        return mare;
    }
}
