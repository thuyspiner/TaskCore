package model;


import java.util.Scanner;

public class Chicken extends Animal {

 private String color;

 public Chicken(String name, int age, String color) {
     super(name, age);
     this.color = color;
 }

 @Override
 public void input() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter chicken's name:");
     name = scanner.nextLine();
     System.out.println("Enter chicken's age:");
     age = scanner.nextInt();
     scanner.nextLine(); 
     System.out.println("Enter chicken's color:");
     color = scanner.nextLine();
 }

 @Override
 public void info() {
     System.out.println("Chicken: ");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Color: " + color);
 }
}


