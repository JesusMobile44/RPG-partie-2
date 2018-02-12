package personnages;

import armes.Magique;
import sorts.BouledeFeu;
import sorts.PicdeGlace;

/**
 * Created by BelSi1731422 on 2018-02-01.
 */
public class MagicienNoir extends Magicien {
    private Magique arme;
    public MagicienNoir(Magique arme) {
        this.pv= 60;
        this.def=1;
        this.nom="Magicien Noir";
        this.magie=50;
        tabSorts[0] = new BouledeFeu();
        tabSorts[1] = new PicdeGlace();
        this.arme = arme;
    }
    public int ajouteDgt(){
        return arme.lancer();
    }
}
