// <robin/rachel macdonald>, AP CSA Unit 1 Challenge, Andrew Jackson High School, <10/26/2021>, <8:57>, v0.6
// Peer Debugging Jordan Johnson
import java.util.Scanner;

public class DamageDealt   {
    public static void main(final String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the name of the monster?");
        String monsterName = myScanner.nextLine();
        System.out.println(monsterName);
        System.out.println("Enter the name of your wepond:");
        String weaponName = myScanner.nextLine();
        System.out.println("\n");
        System.out.println("Please enter the damage value of the weapon");
        double weaponDamage = myScanner.nextDouble();
        System.out.println("\n");

    }


    
}