package model;

import java.util.Scanner;

	public class Student extends Person {
	    private String studentId;

	    public Student() {
	    }

	    public Student(String name, int age, String address, String studentId) {
	        super(name, age, address);
	        this.studentId = studentId;
	    }

	    @Override
	    public void input() {
	        super.input();
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập ID học sinh: ");
	        studentId = scanner.nextLine();
	    }

	    @Override
	    public void info() {
	        super.info();
	        System.out.println("ID Học sinh: " + studentId);
	    }
	}


