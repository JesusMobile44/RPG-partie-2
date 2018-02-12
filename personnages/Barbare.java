package personnages;

import armes.Contondant;

/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public class Barbare extends Guerrier {
    private Contondant arme;
    public Barbare(Contondant arme) {
        this.pv = 100;
        this.def = 3;
        this.nom = "Barbare";
        this.force = 10;
        this.arme = arme;
    }
    public int ajouteDgt(){
        return arme.frapper();
    }
}
