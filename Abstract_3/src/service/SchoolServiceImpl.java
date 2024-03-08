package service;

import model.School;

import java.util.Scanner;

public class SchoolServiceImpl implements SchoolService {
    @Override
    public void input(School school) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id school:");
        int id = scanner.nextInt();
        school.setId(id);
        scanner.nextLine(); 
        System.out.println("Nhập name school:");
        String name = scanner.nextLine();
        school.setName(name);
    }

    @Override
    public void info(School school) {
        System.out.println("School information:");
        System.out.println("ID: " + school.getId());
        System.out.println("Name: " + school.getName());
    }
}
