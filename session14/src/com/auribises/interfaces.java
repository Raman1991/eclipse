package com.auribises;
interface College{
	void attendence();
}
interface Traffic{
	void seatbelt();
}
interface Teacher{
	void attendence();
	void assignments();
}
//Multiple inheritance : interface to interface
interface Inf extends  College, Traffic, Teacher{
	int i = 10; //public static final int i = 10
	
}
//this is not multiple inheritance. this is multiple implementation!!
class Student implements Inf{// College,Traffic,Teacher{
	public void attendence() {
		System.out.println("i will score 90% attendence");
	}
	public void seatbelt() {
		System.out.println("i will wear seatbelt before i drive ");
	}
	public void assignments() {
		System.out.println("i will submit assignment by end of day");
	}
}
public class interfaces {

	public static void main(String[] args) {
		
	College cref = new Student();
	cref.attendence();
	
	System.out.println();
	
	Traffic tref = new Student();
	tref.seatbelt();
	
	System.out.println();
	
	Teacher teacher = new Student();
	teacher.attendence();
	teacher.assignments();
	
	System.out.println();
	
	Inf iref = new Student();
	iref.assignments();
	iref.attendence();
	iref.seatbelt();
	
	//Inf.i = 100;//error
	System.out.println(Inf.i);
	
	

	}

}
