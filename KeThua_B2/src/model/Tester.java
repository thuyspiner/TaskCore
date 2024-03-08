package model;

import java.util.Scanner;

public class Tester extends Employee {
    private String testTools;

    public Tester() {
    }

    public Tester(int id, String name, int age, String testTools) {
        super(id, name, age);
        this.testTools = testTools;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập test tools: ");
        testTools = scanner.nextLine();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Test tools: " + testTools);
    }
}
