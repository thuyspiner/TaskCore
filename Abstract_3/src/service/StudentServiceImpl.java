package service;

import model.Student;

import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    @Override
    public void input(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id student:");
        int id = scanner.nextInt();
        student.setId(id);
        scanner.nextLine(); 
        System.out.println("Nhập tên student:");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.println("Nhập tuổi student:");
        int age = scanner.nextInt();
        student.setAge(age);
    }

    @Override
    public void info(Student student) {
        System.out.println("Student information:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("School: " + student.getSchool().getName());
        System.out.println("Address: " + student.getAddress().getStreet() + ", " + student.getAddress().getCity());
    }
}
