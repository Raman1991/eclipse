package com.auribises;
/*class Cab{
	Cab()
	{
		System.out.println("Cab Object Constructed");
	}
	void bookCab() {
		System.out.println(">> Cab booked !! Arriving Soon");
	}}*/
 /*abstract class Cab{//A class for which you cannot create object
	Cab()             //Refining RTP(Run Time Polymorphism)
	{
		System.out.println("Cab Object Constructed");
	}
	abstract void bookCab(); //Abstract method can be created in abstract class but cannot have definition 
	                      //Rule created by parent
		void show() {
			System.out.println("This is show");
		}
		
	}*/
//Refining RTP to the Best Possible Way !!
//Neither we nor JVM can create Objects of interface !!

 interface Cab{
		/*Cab()
		{
			System.out.println("Cab Object Constructed");
		}*/
	//Abstract method can be created interface but cannot have definition 
     //Rule created by interface

		void bookCab(); //<-Public abstract void bookCab();
		//we cannot have method with definitions
		/*void show() {
			System.out.println("This is show");
		}
		
			System.out.println(">> Cab booked !! Arriving Soon");
		}}*/
 }

	class Ubergo implements Cab{
		Ubergo(){
			System.out.println(">> Ubergo Cab Object constructed");
	}
	public void bookCab()
	{
		System.out.println(">>Ubergo booked !! Ariving Soon");
	}
}
	class UberX implements Cab{
		UberX(){
			System.out.println(">> UberX Cab Object constructed");
	}
	public void bookCab()
	{
		System.out.println(">>UberX booked !! Ariving Soon");
	}
}
	class UberMoto implements Cab{
		UberMoto(){
			System.out.println(">> UberMoto Cab Object constructed");
	}
		//overriding
	public void bookCab(){
	
		System.out.println(">>UberMoto booked !! Ariving Soon");
	}
	//void sayHello() {
		//System.out.println("Hello");
	}




public class RTPDemo {

	public static void main(String[] args) {
		/*Cab cref;
		cref = new Cab();  //when object is constructed constructor is executed!!
		cref.bookCab();
		
		Ubergo uref = new Ubergo(); // when child object is constructed parent is constructed first than child!!
		uref.bookCab();
		*/
		//Polymorphic statement: Parent's Ref Var is pointing to object of child 
		
		Cab cref;     //parent's ref var variable only parse overriding !!
		cref = new Ubergo(); //Interface Ref Var is pointing to Object which implements it !!
		cref.bookCab();
		
	    cref = new UberX();
		cref.bookCab();
		
		cref = new UberMoto();
		cref.bookCab();
		//cref.sayHello();
		
		
				
				
				
		

	}

}
