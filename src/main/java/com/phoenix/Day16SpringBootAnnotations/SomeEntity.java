package com.phoenix.Day16SpringBootAnnotations;

public class SomeEntity {

	String dat;
	int age;
	
	public SomeEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public SomeEntity(String v1, int v2)
	{
		dat=v1;
		age=v2;
	}

	public String getDat() {
		return dat;
	}

	public void setDat(String data) {
		this.dat = data;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
