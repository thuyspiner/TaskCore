package model;

public class Student {
    private int id;
    private String name;
    private int age;
    private School school;
    private Address address;
    
    
	public Student() {
		
	}
	public Student(int id, String name, int age, School school, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.school = school;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

    
}
