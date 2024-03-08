package main;



import model.Student;
import model.School;
import model.Address;
import service.*;

import java.util.Scanner;

public class MainWithArray {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Nhập số student:");
     int numOfStudents = scanner.nextInt();
     scanner.nextLine();

     StudentService studentService = new StudentServiceImpl();
     SchoolService schoolService = new SchoolServiceImpl();
     AddressService addressService = new AddressServiceImpl();

     School school = new School();
     schoolService.input(school);

     Address address = new Address();
     addressService.input(address);

     Student[] students = new Student[numOfStudents];

     for (int i = 0; i < numOfStudents; i++) {
         students[i] = new Student(0, "", 0, school, address);
         studentService.input(students[i]);
     }

     for (Student student : students) {
         studentService.info(student);
     }

     // tìm student tuổi lớn nhất
     int maxAge = Integer.MIN_VALUE;
     Student oldestStudent = null;
     for (Student student : students) {
         if (student.getAge() > maxAge) {
             maxAge = student.getAge();
             oldestStudent = student;
         }
     }

     System.out.println("Student với tuổi lớn nhất là:");
     studentService.info(oldestStudent);
 }
}

