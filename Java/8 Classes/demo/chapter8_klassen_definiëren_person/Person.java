package org.rastalion.chapter8_klassen_definiëren_person;

import java.util.Arrays;

public class Person {
	
	String name;
	String lastName;
	
	
	int age;
	double heigth;
	String adress;
	
	String [] hobby;
	
	
	public Person() {
		super();
	}
	public Person(String name, String lastName, int age, double heigth, String adress, String[] hobby) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.heigth = heigth;
		this.adress = adress;
		this.hobby = hobby;
	}
	
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void setAdress(String street, int number, int zip) {
		this.adress = street + " " + number + " " + zip;
	}
	
	public void addHobby(String hobby) {
		String [] temp = new String[this.hobby.length+1];
		temp[this.hobby.length +1] = hobby;
		this.hobby = temp;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + ", heigth=" + heigth + ", adress="
				+ adress + ", hobby=" + Arrays.toString(hobby) + "]";
	}

	
	

}
