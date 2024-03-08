package service;


import model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonService {
 
 public List<Person> input() {
     List<Person> persons = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
     while (true) {
         System.out.println("ID person:");
         int id = scanner.nextInt();
         scanner.nextLine();
         System.out.println("Name person:");
         String name = scanner.nextLine();
         System.out.println("Age person:");
         int age = scanner.nextInt();
         scanner.nextLine(); 

         persons.add(new Person(id, name, age));

         System.out.println("continue? (yes/no)");
         String choice = scanner.nextLine();
         if (!choice.equalsIgnoreCase("yes")) {
             break;
         }
     }
     return persons;
 }

 
 public void info(List<Person> persons) {
     System.out.println("List of persons:");
     for (Person person : persons) {
         System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
     }
 }

 
 public void filter(List<Person> persons) {
     System.out.println("Persons với tuổi nhỏ hơn 20:");
     for (Person person : persons) {
         if (person.getAge() < 20) {
             System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
         }
     }
 }

 
 public void delete(List<Person> persons) {
     Iterator<Person> iterator = persons.iterator();
     while (iterator.hasNext()) {
         Person person = iterator.next();
         if (person.getName().contains("A")) {
             iterator.remove();
         }
     }
     info(persons);
 }


 public void sortPerson(List<Person> persons) {
     persons.sort((p1, p2) -> p1.getAge() - p2.getAge());
     System.out.println("Sắp xếp người theo độ tuổi (thứ tự tăng dần):");
     info(persons);
 }

 
 public void sortPersonDescending(List<Person> persons) {
     persons.sort((p1, p2) -> p2.getAge() - p1.getAge());
     System.out.println("Sắp xếp người theo độ tuổi (thứ tự giảm dần):");
     info(persons);
 }
}

