package be.technifutur.superCanard;

public class Mandarin extends Canard {
    public Mandarin(ComportementCanCan comportementCancan, ComportementVol comportementVol) {
        super(comportementCancan, comportementVol);
    }

    @Override
    public String afficher() {
        return "Mandarin";
    }

}
