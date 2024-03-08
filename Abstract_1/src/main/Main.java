package main;



import model.Person;
import model.Employee;
import model.Boss;

public class Main {
 public static void main(String[] args) {
     Person employee = new Employee();
     Person boss = new Boss();

     System.out.println("Lương nhân viên:");
     printSalary(employee);

     System.out.println("Lương xếp:");
     printSalary(boss);
 }

 public static void printSalary(Person person) {
     person.salary();
 }
}

