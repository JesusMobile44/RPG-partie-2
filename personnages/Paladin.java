package personnages;

import armes.Tranchant;

/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public class Paladin extends Guerrier {
    private Tranchant arme;
    public Paladin(Tranchant arme) {
        this.pv = 80;
        this.def = 5;
        this.nom = "Paladin";
        this.force = 5;
        this.arme = arme;
    }
    public int ajouteDgt(){
        return arme.trancher();
    }
}
