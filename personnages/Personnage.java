package personnages;

/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public abstract class  Personnage {
    protected int pv;
    protected int def;
    protected String nom;

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void attaquer(Personnage personnage);

    public abstract int ajouteDgt();
}
