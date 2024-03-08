package model;

import java.util.Scanner;

public class Teacher extends Person {
    private String teacherId;

    public Teacher() {
    }

    public Teacher(String name, int age, String address, String teacherId) {
        super(name, age, address);
        this.teacherId = teacherId;
    }


    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID giáo viên: ");
        teacherId = scanner.nextLine();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("ID Giáo viên: " + teacherId);
    }
}

