package com.maaz.model;

public class Person {
	private int id;
	private int age;
	private String name;
	private float weight;
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	public Person(int id, int age, String name, float weight) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}
