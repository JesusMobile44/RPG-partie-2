/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public abstract class Sort{
    int cout;
    int dgt;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    String nom;
    public abstract void lancerSort(Personnage personnage);

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public int getDgt() {
        return dgt;
    }

    public void setDgt(int dgt) {
        this.dgt = dgt;
    }
}
