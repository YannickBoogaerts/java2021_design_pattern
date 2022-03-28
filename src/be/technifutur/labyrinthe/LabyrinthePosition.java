package be.technifutur.labyrinthe;

public interface LabyrinthePosition {

    LabyrinthePosition getPosition(Direction direction);

    public int getLine();

    public int getColumn();
}
