package be.technifutur.superCanard;

public abstract class Canard {
    private ComportementCanCan comportementCancan;
    private ComportementVol comportementVol;

    public void setComportementCancan(ComportementCanCan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public Canard(ComportementCanCan comportementCancan, ComportementVol comportementVol) {
        this.comportementCancan = comportementCancan;
        this.comportementVol = comportementVol;
    }

    public abstract String afficher();

    public String cancaner() {
        return this.comportementCancan.cancaner();
    }

    public String voler() {
        return this.comportementVol.voler();
    }

    public String nager() {
        return "je nage";
    }

    public ComportementCanCan getComportementCancan() {
        return comportementCancan;
    }
}
