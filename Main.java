import java.util.Scanner;

/**
 * Created by BelSi1731422 on 2018-01-29.
 */
public class Main {
    public static void main(String[] args) {
        int player1;int player2;
        Personnage combattant[] = new Personnage[2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est la classe du combattant #1");
        System.out.println("    1 - Barbare");
        System.out.println("    2 - Paladin");
        System.out.println("    3 - Magicien Noir");
        System.out.println("    4 - Magicien Rouge");
        player1=sc.nextInt();
        System.out.println("Quel est la classe du combattant #1");
        System.out.println("    1 - Barbare");
        System.out.println("    2 - Paladin");
        System.out.println("    3 - Magicien Noir");
        System.out.println("    4 - Magicien Rouge");
    }
}
