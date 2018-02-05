/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public abstract class Guerrier extends Personnage {
    protected int force;
    public void attaquer(Personnage personnage) {
        System.out.println("Le "+nom+" attaque!");
        personnage.setPv(personnage.getPv()-(force*2-personnage.getDef()));
    }
}
