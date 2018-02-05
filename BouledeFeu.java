/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public class BouledeFeu extends Sort {
    public BouledeFeu(int _cout,int _dgt) {
        this.cout=5;
        this.dgt=5;
    }
    public void lancerSort(Personnage personnage){
        personnage.setPv(personnage.getPv()-dgt);
    }
}
