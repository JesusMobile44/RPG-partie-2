package personnages;

/**
 * Created by BelSi1731422 on 2018-01-29.
 */
import sorts.Sort;

public abstract class Magicien extends Personnage {
    Sort tabSorts[] = new Sort[2];
    public int magie;

    public void attaquer(Personnage personnage){
        int random = (int)(Math.random()*2);
        System.out.println("");
        System.out.println("Le "+nom+" attaque!");
        System.out.println("Le "+nom+" lance "+tabSorts[random].getNom()+", ce qui lui coûte "+tabSorts[random].getCout()+" points de magie.");
        if (magie>=tabSorts[random].getCout()){
            magie=magie-tabSorts[random].getCout();
            tabSorts[random].lancerSort(personnage);
            personnage.setPv(personnage.getPv()-ajouteDgt());
        }
        else{
            System.out.println("Vous n'avez pas assez de magie");
        }
        System.out.println("Il lui en reste "+magie);
        System.out.println("Le "+personnage.getNom()+" perd "+(tabSorts[random].getDgt()+ajouteDgt())+" point de vie, il lui en reste "+personnage.getPv());
    }
    public abstract int ajouteDgt();
}
