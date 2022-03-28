package be.technifutur.superCanard;

public class Begayer implements ComportementCanCan {
    private final ComportementCanCan cri;

    public Begayer(ComportementCanCan comportementCancan) {
        this.cri = comportementCancan;
    }

    @Override
    public String cancaner() {
        return cri.cancaner()+cri.cancaner();
    }
}
