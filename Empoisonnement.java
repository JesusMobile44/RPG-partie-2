/**
 * Created by BelSi1731422 on 2018-02-01.
 */
public class Empoisonnement extends Sort {
    int nb;
    public Empoisonnement(){
        this.nb=0;
        this.cout=2;
        this.dgt=2;
        this.nom="Empoisonnement";
    }
    public void lancerSort(Personnage personnage){
        personnage.setPv(personnage.getPv()-dgt);
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }
}
