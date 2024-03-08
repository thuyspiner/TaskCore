package service;

import model.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PersonService {
 // Method to input a set of persons
 public Set<Person> input() {
     Set<Person> persons = new HashSet<>();
     Scanner scanner = new Scanner(System.in);
     while (true) {
         System.out.println("person ID:");
         int id = scanner.nextInt();
         scanner.nextLine(); 
         System.out.println("person name:");
         String name = scanner.nextLine();
         System.out.println("person age:");
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


 public void info(Set<Person> persons) {
     System.out.println("List of persons:");
     for (Person person : persons) {
         System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
     }
 }

 
 public void filter(Set<Person> persons) {
     System.out.println("Persons với tuổi nhỏ hơn 20:");
     for (Person person : persons) {
         if (person.getAge() < 20) {
             System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
         }
     }
 }

 
 public void delete(Set<Person> persons) {
     Iterator<Person> iterator = persons.iterator();
     while (iterator.hasNext()) {
         Person person = iterator.next();
         if (person.getName().contains("A")) {
             iterator.remove();
         }
     }
     info(persons);
 }
}

