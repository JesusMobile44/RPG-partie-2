import personnages.*;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.Scanner;

/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public class Main {
    public static void main(String[] args) {
        int choix;
        boolean gameOver = false;
        Personnage combattant[] = new Personnage[2];
        boolean fini = false;
        Scanner sc = new Scanner(System.in);

        while (fini != true) {
            System.out.println("Quel est la classe du combattant #1");
            System.out.println("    1 - Barbare");
            System.out.println("    2 - Paladin");
            System.out.println("    3 - Magicien Noir");
            System.out.println("    4 - Magicien Rouge");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    Personnage barbare1 = new Barbare();
                    combattant[0] = barbare1;
                    fini = true;
                    break;
                case 2:
                    Personnage paladin1 = new Paladin();
                    combattant[0] = paladin1;
                    fini = true;
                    break;
                case 3:
                    Personnage magicienNoir1 = new MagicienNoir();
                    combattant[0] = magicienNoir1;
                    fini = true;
                    break;
                case 4:
                    Personnage magicienRouge1 = new MagicienRouge();
                    combattant[0] = magicienRouge1;
                    fini = true;
                    break;
                default:
                    System.out.println("Choisi une option valide >:^(");
            }
        }
        fini = false;
        while (fini != true) {
            System.out.println("Quel est la classe du combattant #2");
            System.out.println("    1 - Barbare");
            System.out.println("    2 - Paladin");
            System.out.println("    3 - Magicien Noir");
            System.out.println("    4 - Magicien Rouge");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    Personnage barbare2 = new Barbare();
                    combattant[1] = barbare2;
                    fini = true;
                    break;
                case 2:
                    Personnage paladin2 = new Paladin();
                    combattant[1] = paladin2;
                    fini = true;
                    break;
                case 3:
                    Personnage magicienNoir2 = new MagicienNoir();
                    combattant[1] = magicienNoir2;
                    fini = true;
                    break;
                case 4:
                    Personnage magicienRouge2 = new MagicienRouge();
                    combattant[1] = magicienRouge2;
                    fini = true;
                    break;
                default:
                    System.out.println("Choisi une option valide >:^(");
            }
        }
        while (combattant[0].getPv() > 0 && combattant[1].getPv() > 0 && gameOver == false) {
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    combattant[0].attaquer(combattant[1]);
                    stop();
                    if (combattant[1].getPv() <= 0) {
                        System.out.println("");
                        System.out.println("Le " + combattant[1].getNom() + " est mort, le " + combattant[0].getNom() + " a gagné!!!!!!");
                        i = 2;
                        gameOver = true;
                    }
                }
                else if (i == 1) {
                    combattant[1].attaquer(combattant[0]);
                    stop();
                    if (combattant[0].getPv() <= 0) {
                        System.out.println("");
                        System.out.println("Le " + combattant[0].getNom() + " est mort, le " + combattant[1].getNom() + " a gagné!!!!!!");
                        i = 2;
                        gameOver = true;
                    }
                }
                if (combattant[0] instanceof Magicien && combattant[1] instanceof Magicien && ((Magicien) combattant[0]).magie < 2 && ((Magicien) combattant[1]).magie < 2) {
                    System.out.println("");
                    System.out.println("Le " + combattant[0].getNom() + " et le " + combattant[1] + " n'ont plus de magie!");
                    System.out.println("Ils fuient comme des lâches >:^(");
                    i = 2;
                    gameOver = true;
                }
            }
        }
    }

    private static void stop() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
