package com.demo.streamexample;

public class Employee {

	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	private double salary;
	private String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public Employee(int id, int age, double salary, String department,String name) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
				+ department + ", getName()=" + getName() + ", getId()=" + getId() + ", getAge()=" + getAge()
				+ ", getSalary()=" + getSalary() + ", getDepartment()=" + getDepartment() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
