package be.technifutur.superCanard;

public class Colvert extends Canard {
    public Colvert(ComportementCanCan comportementCancan, ComportementVol comportementVol) {
        super(comportementCancan, comportementVol);
    }

    @Override
    public String afficher() {
        return "Colvert";
    }

}
