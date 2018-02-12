package personnages;

import armes.Magique;
import sorts.Empoisonnement;
import sorts.MortSubite;

/**
 * Created by BelSi1731422 on 2018-02-05.
 */
public class MagicienRouge extends Magicien {
    private Magique arme;
    public MagicienRouge(Magique arme) {
        this.pv= 60;
        this.def=1;
        this.nom="Magicien Rouge";
        this.magie=40;
        tabSorts[0] = new Empoisonnement();
        tabSorts[1] = new MortSubite();
        this.arme = arme;
    }
    public int ajouteDgt(){
        return arme.lancer();
    }
}
