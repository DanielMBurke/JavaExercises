package com.techelevator;

public class Helloworld {

	public static void main(String[] args) {
		System.out.println("Hello, world.");
		int numStudents = 18;
		{ //start of block
			
		numStudents += 1;
		} //end of block
		numStudents -= 1;
		printNumStudents(numStudents);	//should print value
		printNumStudents(0);		//should print not student message

	}  //end of main
	
	public static void printNumStudents(int howMany) 
	{
		if (howMany == 0) //**always use {} after if and else statements**
			{
			System.out.println ("No students in class");
			}
		else 
			{
			System.out.println ("NumStudents:"+ howMany);
			}
	}

}	