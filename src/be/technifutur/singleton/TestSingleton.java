package be.technifutur.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Mare mare1 = Mare.getMare();
        Mare mare2 = Mare.getMare();
        Mare mare3 = Mare.getMare();
        Mare mare4 = Mare.getMare();

        System.out.println(mare1 == mare2);
        System.out.println(mare1 == mare3);
        System.out.println(mare1 == mare4);
    }
}
