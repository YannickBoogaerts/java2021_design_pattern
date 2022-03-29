package be.technifutur.superCanard;

public class Mandarin extends Canard implements Cloneable{
    public Mandarin(ComportementCanCan comportementCancan, ComportementVol comportementVol) {
        super(comportementCancan, comportementVol);
    }

    @Override
    public String afficher() {
        return "Mandarin";
    }

    @Override
    public Mandarin clone(){
        Mandarin clone = null;
        try {
            clone = (Mandarin)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
