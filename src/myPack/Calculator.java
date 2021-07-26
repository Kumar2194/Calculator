package myPack;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int result=0,a,b;
		String ans;
		Scanner obj =new Scanner (System.in);
		boolean isvalid=true;
		
		System.out.println("Welocome to Calclator");
		System.out.println("Enter your first number : ");
		a=obj.nextInt();
		System.out.println("Enter your second number : ");
		b=obj.nextInt();
		
		System.out.println("Arthematic Operations : ");
		System.out.println("Addition : + ");
		System.out.println("Subtraction : - ");
		System.out.println("Multiplication : * ");
		System.out.println("Divison : / ");
		System.out.println("Enter yor choice with Symbol: ");
		ans = obj.next();
		
		switch (ans)
		{
		case "+" : 
			result =a+b;
			break;
		case "-" :
			result =a-b;
			break;
		case "*" :
			result =a*b;
			break;
		case "/" :
			result =a/b;
		default :
			isvalid=false;
		}
		
		if(isvalid)
			System.out.println("Result :" +result);
		else
			System.out.println("Invalid Option");
	}
		

	}
