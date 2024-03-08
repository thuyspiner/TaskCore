package main;

import model.Student;
import model.Teacher;

import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giáo viên: ");
        int numTeachers = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Teacher[] teachers = new Teacher[numTeachers];

        for (int i = 0; i < numTeachers; i++) {
            System.out.println("Nhập gv  " + (i + 1) + ":");
            teachers[i] = new Teacher();
            teachers[i].input();
        }

        System.out.println("\nThông tin gv:");
        for (int i = 0; i < numTeachers; i++) {
            System.out.println("Gv" + (i + 1) + ":");
            teachers[i].info();
            System.out.println();
        }
    }
}

