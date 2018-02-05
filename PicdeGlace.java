/**
 * Created by BelSi1731422 on 2018-02-01.
 */
public class PicdeGlace extends Sort{
    public PicdeGlace(){
        this.cout=5;
        this.dgt=7;
    }
    public void lancerSort(Personnage personnage){
        personnage.setPv(personnage.getPv()-(dgt-personnage.getDef()));
    }
}
