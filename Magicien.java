/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public abstract class Magicien extends Personnage {
    Sort tabSorts[] = new Sort[2];
    protected int magie;

    public void attaquer(Personnage personnage){
        int random = (int)(Math.random()*1);
        if (magie>=tabSorts[random].getCout()){
            tabSorts[random].lancerSort(personnage);
        }
        else{
            System.out.println("Vous n'avez pas assez de magie");
        }
    }
}
