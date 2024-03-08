package main;


import model.Person;
import service.PersonService;

import java.util.List;

public class Main {
 public static void main(String[] args) {
     PersonService personService = new PersonService();

     List<Person> persons = personService.input();

    
     personService.info(persons);

     
     personService.filter(persons);

     
     personService.delete(persons);

    
     personService.sortPerson(persons);

    
     personService.sortPersonDescending(persons);
 }
}
