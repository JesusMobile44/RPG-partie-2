/**
 * Created by BelSi1731422 on 2018-02-01.
 */
public class MortSubite extends Sort {
    public MortSubite(int _cout,int _dgt){
        this.cout=10;
        this.dgt=_dgt;
    }
    public void lancerSort(Personnage personnage){
        int random = (int)(Math.random()*10);
        if (random==5){
            dgt=personnage.getPv();
            personnage.setPv(personnage.getPv()-dgt);
        }
        else{
            System.out.println("il ne ce passe rien...");
        }
    }
}
