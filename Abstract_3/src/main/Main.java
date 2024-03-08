package main;


import model.Student;
import model.School;
import model.Address;
import service.*;

public class Main {
 public static void main(String[] args) {
     StudentService studentService = new StudentServiceImpl();
     SchoolService schoolService = new SchoolServiceImpl();
     AddressService addressService = new AddressServiceImpl();

     Student student = new Student();
     studentService.input(student);

     School school = new School();
     schoolService.input(school);
     student.setSchool(school);

     Address address = new Address();
     addressService.input(address);
     student.setAddress(address);

     studentService.info(student);
 }
}

