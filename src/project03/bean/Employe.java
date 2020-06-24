package project03.bean;


import project03.util.Data;
public class Employe {
	private int id;
	private String name;
	private int age;
	private double salary;
	
	private static  Employe[] allEmployes;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employe(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employe() {
		super();
	}
	@Override
	public String toString() {
		return getBasicinfo();
	}
	
	
	protected String getBasicinfo() {
		// TODO Auto-generated method stub
		return id+"\t"+name+"\t"+age+"\t"+salary;
	}
	
	
	
	
	
	
	
}
