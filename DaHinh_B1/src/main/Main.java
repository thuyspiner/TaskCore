package main;

import model.Animal;
import model.Dog;
import model.Chicken;

import java.util.Scanner;

public class Main {

 public static void input(Animal animal) {
     animal.input();
 }

 public static void info(Animal animal) {
     animal.info();
 }

 public static void menuDog() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Số lượng dog:");
     int numOfDogs = scanner.nextInt();
     scanner.nextLine(); 

     Dog[] dogs = new Dog[numOfDogs];
     for (int i = 0; i < numOfDogs; i++) {
         dogs[i] = new Dog("", 0, "");
         input(dogs[i]);
     }

     for (Dog dog : dogs) {
         info(dog);
     }
 }

 public static void menuChicken() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Số lượng chicken:");
     int numOfChickens = scanner.nextInt();
     scanner.nextLine();

     Chicken[] chickens = new Chicken[numOfChickens];
     for (int i = 0; i < numOfChickens; i++) {
         chickens[i] = new Chicken("", 0, "");
         input(chickens[i]);
     }

     for (Chicken chicken : chickens) {
         info(chicken);
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     while (true) {
         System.out.println("1. Nhập dog");
         System.out.println("2. Nhập chicken");
         System.out.println("3. Exit");
         System.out.println("Lựa chọn:");

         int choice = scanner.nextInt();
         scanner.nextLine(); 

         switch (choice) {
             case 1:
                 menuDog();
                 break;
             case 2:
                 menuChicken();
                 break;
             case 3:
                 System.out.println("Thoát");
                 System.exit(0);
             default:
                 System.out.println("Chọn lại");
         }
     }
 }
}
