package be.technifutur.superCanard;

public class Leurre extends Canard {

    public Leurre(ComportementCanCan comportementCancan, ComportementVol comportementVol) {
        super(comportementCancan, comportementVol);
    }

    @Override
    public String afficher() {
        return "Leurre";
    }

}
