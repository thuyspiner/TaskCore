package model;

import java.util.Scanner;

public class Developer extends Employee {
    private String programLanguage;

    public Developer() {
    }

    public Developer(int id, String name, int age, String programLanguage) {
        super(id, name, age);
        this.programLanguage = programLanguage;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngôn ngữ lập trình: ");
        programLanguage = scanner.nextLine();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Ngôn ngữ lập trình: " + programLanguage);
    }
}
