package be.technifutur.superCanard;

public class CanardEnPlastique extends Canard {
    public CanardEnPlastique(ComportementCanCan comportementCancan, ComportementVol comportementVol) {
        super(comportementCancan, comportementVol);
    }

    @Override
    public String afficher() {
        return "Canard en plastique";
    }
}
