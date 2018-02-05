/**
 * Created by BelSi1731422 on 2018-02-01.
 */
public class MagicienNoir extends Magicien{
    public MagicienNoir() {
        this.pv= 60;
        this.def=1;
        this.nom="Magicien Noir";
        this.magie=50;
        tabSorts[0] = new BouledeFeu(5,5);
        tabSorts[1] = new PicdeGlace(5,7);
    }
}
