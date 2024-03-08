package model;

import java.util.Scanner;

public class Employee {
    protected int id;
    protected String name;
    protected int age;

    public Employee() {
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

