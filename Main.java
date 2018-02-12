import armes.*;
import personnages.*;

import java.util.Scanner;

/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean gameOver = false;
        Personnage combattant[] = new Personnage[2];

        System.out.println("Combattant #1");
        combattant[0]= choixClasse();
        System.out.println("Combattant #2");
        combattant[1]= choixClasse();

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
    public static Personnage choixClasse() {
        int choix = 1;
        int choixArmes;
        while (choix <= 4 && choix >= 1) {
            System.out.println("Quel est la classe du combattant");
            System.out.println("    1 - Barbare");
            System.out.println("    2 - Paladin");
            System.out.println("    3 - Magicien Noir");
            System.out.println("    4 - Magicien Rouge");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Quel arme voulez-vous donnez au Barbare?");
                    System.out.println("    1 - Massue");
                    System.out.println("    2 - Épée Lourde");
                    System.out.println("    3 - Sceptre");
                    System.out.println("    4 - Masamune");
                    choixArmes = sc.nextInt();
                    switch (choixArmes) {
                        case 1:
                            return new Barbare(new Massue());

                        case 2:
                            return new Barbare(new ÉpéeLourde());

                        case 3:
                            return new Barbare(new Sceptre());

                        case 4:
                            return new Barbare(new Masamune());
                        default:
                            System.out.println("Choisissez un nombre valide");
                    }
                    break;
                case 2:
                    System.out.println("Quel arme voulez-vous donnez au Paladin?");
                    System.out.println("    1 - Épée");
                    System.out.println("    2 - Épée Lourde");
                    System.out.println("    3 - Épée Magique");
                    System.out.println("    4 - Masamune");
                    choixArmes = sc.nextInt();
                    switch (choixArmes) {
                        case 1:
                            return new Paladin(new Épée());

                        case 2:
                            return new Paladin(new ÉpéeLourde());

                        case 3:
                            return new Paladin(new ÉpéeMagique());

                        case 4:
                            return new Paladin(new Masamune());
                        default:
                            System.out.println("Choisissez un nombre valide");
                    }
                    break;
                case 3:
                    System.out.println("Quel arme voulez-vous donnez au Magicien Noir?");
                    System.out.println("    1 - Baguette");
                    System.out.println("    2 - Épée Magique");
                    System.out.println("    3 - Sceptre");
                    System.out.println("    4 - Masamune");
                    choixArmes = sc.nextInt();
                    switch (choixArmes) {
                        case 1:
                            return new MagicienNoir(new Baguette());

                        case 2:
                            return new MagicienNoir(new ÉpéeMagique());

                        case 3:
                            return new MagicienNoir(new Sceptre());

                        case 4:
                            return new MagicienNoir(new Masamune());
                        default:
                            System.out.println("Choisissez un nombre valide");
                    }
                    break;
                case 4:
                    System.out.println("Quel arme voulez-vous donnez au Magicien Noir?");
                    System.out.println("    1 - Baguette");
                    System.out.println("    2 - Épée Magique");
                    System.out.println("    3 - Sceptre");
                    System.out.println("    4 - Masamune");
                    choixArmes = sc.nextInt();
                    switch (choixArmes) {
                        case 1:
                            return new MagicienRouge(new Baguette());

                        case 2:
                            return new MagicienRouge(new ÉpéeMagique());

                        case 3:
                            return new MagicienRouge(new Sceptre());

                        case 4:
                            return new MagicienRouge(new Masamune());
                        default:
                            System.out.println("Choisissez un nombre valide");
                    }
                    break;
                default:
                    System.out.println("Choisi une option valide >:^(");
            }
        }
        return null;
    }
}
