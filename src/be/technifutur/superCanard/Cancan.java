package be.technifutur.superCanard;

public class Cancan implements ComportementCanCan{
    @Override
    public String cancaner() {
        return null;
    }
    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
