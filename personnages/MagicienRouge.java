package personnages;

import sorts.Empoisonnement;
import sorts.MortSubite;

/**
 * Created by BelSi1731422 on 2018-02-05.
 */
public class MagicienRouge extends Magicien {
    public MagicienRouge() {
        this.pv= 60;
        this.def=1;
        this.nom="Magicien Rouge";
        this.magie=40;
        tabSorts[0] = new Empoisonnement();
        tabSorts[1] = new MortSubite();
    }
}
