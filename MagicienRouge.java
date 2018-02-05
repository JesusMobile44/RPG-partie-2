/**
 * Created by BelSi1731422 on 2018-02-05.
 */
public class MagicienRouge extends Magicien{
    public MagicienRouge(int _pv, int _def, String _nom, int magie) {
        this.pv= 60;
        this.def=1;
        this.nom="Magicien Rouge";
        this.magie=40;
        tabSorts[0] = new Empoisonnement(2,2,0);
        tabSorts[1] = new PicdeGlace(10,0);
    }
}
