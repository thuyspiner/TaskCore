package model;
import java.util.Scanner;
public class Person {
	    protected String name;
	    protected int age;
	    protected String address;

	    public Person() {
	    }

	    public Person(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    public void input() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập tên: ");
	        name = scanner.nextLine();
	        System.out.print("Nhập tuổi: ");
	        age = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.print("Nhập địa chỉ: ");
	        address = scanner.nextLine();
	    }

	    public void info() {
	        System.out.println("Tên: " + name);
	        System.out.println("Tuổi: " + age);
	        System.out.println("Địa chỉ: " + address);
	    
	}

}
