package main;

import model.Student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số học sinh: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Học sinh thứ " + (i + 1) + ":");
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("Thông tin về học sinh:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Học sinh thứ " + (i + 1) + ":");
            students[i].info();
            System.out.println();
        }
    }
}

