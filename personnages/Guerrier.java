package personnages;

/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public abstract class Guerrier extends Personnage {
    protected int force;
    public void attaquer(Personnage personnage) {
        System.out.println("");
        System.out.println("Le "+nom+" attaque!");
        personnage.setPv(personnage.getPv()-(force*2-personnage.getDef()));
        System.out.println("Le "+personnage.getNom()+" perd "+(force*2-personnage.getDef())+" point de vie, il lui en reste "+personnage.getPv());
    }
}
