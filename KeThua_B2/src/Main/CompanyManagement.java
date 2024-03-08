package Main;

import model.Developer;
import model.Leader;
import model.Tester;

import java.util.Scanner;

public class CompanyManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng developer: ");
        int numDevelopers = scanner.nextInt();
        scanner.nextLine(); 

        Developer[] developers = new Developer[numDevelopers];
        for (int i = 0; i < numDevelopers; i++) {
            System.out.println("Developer thứ " + (i + 1) + ":");
            developers[i] = new Developer();
            developers[i].input();
        }

        System.out.println("\nNhập số lượng leader: ");
        int numLeaders = scanner.nextInt();
        scanner.nextLine(); 

        Leader[] leaders = new Leader[numLeaders];
        for (int i = 0; i < numLeaders; i++) {
            System.out.println("Leader thứ " + (i + 1) + ":");
            leaders[i] = new Leader();
            leaders[i].input();
        }

        System.out.println("\nNhập số lượng tester: ");
        int numTesters = scanner.nextInt();
        scanner.nextLine(); 

        Tester[] testers = new Tester[numTesters];
        for (int i = 0; i < numTesters; i++) {
            System.out.println("Tester thứ " + (i + 1) + ":");
            testers[i] = new Tester();
            testers[i].input();
        }

        System.out.println("\nThông tin của developers:");
        for (Developer developer : developers) {
            developer.info();
            System.out.println();
        }

        System.out.println("\nThông tin của leaders:");
        for (Leader leader : leaders) {
            leader.info();
            System.out.println();
        }

        System.out.println("\nThông tin của testers:");
        for (Tester tester : testers) {
            tester.info();
            System.out.println();
        }
    }
}
