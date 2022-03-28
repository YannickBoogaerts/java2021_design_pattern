package be.technifutur.superCanard;

public class TestVitual {

    static void effectuerCri(ComportementCanCan cri){
        System.out.println("TestVitual.effectuerCri(ComportementCanCan cri)");
    }

    static void effectuerCri(Cancan cri){
        System.out.println("TestVitual.effectuerCri(Cancan cri)");
    }

    public static void main(String[] args) {
        ComportementCanCan cri = new Cancan();
        Cancan cri2 = (Cancan) cri;

        cri.cancaner();

        effectuerCri(cri);
        effectuerCri(cri2);
    }
}
