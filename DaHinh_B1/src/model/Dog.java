package model;


import java.util.Scanner;

public class Dog extends Animal {

 private String breed;

 public Dog(String name, int age, String breed) {
     super(name, age);
     this.breed = breed;
 }

 @Override
 public void input() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Nhập tên dog:");
     name = scanner.nextLine();
     System.out.println("Nhập tuổi dog:");
     age = scanner.nextInt();
     scanner.nextLine(); 
     System.out.println("Nhập giống loài:");
     breed = scanner.nextLine();
 }

 @Override
 public void info() {
     System.out.println("Dog: ");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Breed: " + breed);
 }
}



