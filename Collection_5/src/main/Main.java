package main;


import model.Person;
import service.PersonService;

import java.util.Set;

public class Main {
 public static void main(String[] args) {
     PersonService personService = new PersonService();

   
     Set<Person> persons = personService.input();

     
     personService.info(persons);

   
     personService.filter(persons);

    
     personService.delete(persons);
 }
}

