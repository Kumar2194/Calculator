package myPack;
//Created myPack by creating a new Java Project
import java.util.Scanner;
//util. Scanner is a class in the Java API used to create a Scanner object 
public class Calculator {
//Created class as Calculation
	
	public static void main(String[] x) {
		//public is a access modifier which specifies from where and who can access the method
		//static is keyword where should call the main() method without creating an object
		// void is a keyword and used to specify that a method doesn’t return anything. 
		//main is the name of Java main method.
		//(String[] x) stores Java command line arguments and is an array of type java.lang.String class.

		int result=0,a,b;
		//Initialized Variable a , b and result =0.
		String ans;
		//declaring ans word as String.
		Scanner obj =new Scanner (System.in);
		//Created a new object of Scanner class which is defined in java.
		//Scanner class allows user to take input from console.
		boolean isvalid=true;
		//declared boolean variable 
		
		System.out.println("Welocome to Calclator");
		System.out.println("Enter your first number : ");
		//Printing the first output at console
		a=obj.nextInt();
		//Initializing the object obj of scanner class to variable a
		System.out.println("Enter your second number : ");
		//Printing the second out put at console
		b=obj.nextInt();
		//Initializing the object obj of scanner class to variable b
		
		System.out.println("Arthematic Operations : ");
		System.out.println("Addition : + ");
		System.out.println("Subtraction : - ");
		System.out.println("Multiplication : * ");
		System.out.println("Divison : / ");
		System.out.println("Enter yor choice with Symbol: ");
		//Printing the Arithmetic operations by using symbols
		ans = obj.next();
		//Initializing the object to String ans.
		
		switch (ans)
		//Using Switch statement we are executing one statement from multiple conditions
		{
		case "+" : 
			result =a+b;
			break;
			//In first case we are adding numbers
			//Intializing result = a+b
			//breaking the first case
		case "-" :
			result =a-b;
			break;
		case "*" :
			result =a*b;
			break;
		case "/" :
			result =a/b;
			//Like wise we are using addition, Subtraction, Divison and Multiplication
		default :
			isvalid=false;
			//declaring default boolean is false
		}
		
		if(isvalid)
			System.out.println("Result is :" +result);
		//using if statement checking the input code is valid or not
		//if valid it will give us result
		else
			System.out.println("Invalid Option entered, Please check and try");
		//using else whether code is not valid printing the statement.
		obj.close();
		//we have closed the object.
	}
		

	}
