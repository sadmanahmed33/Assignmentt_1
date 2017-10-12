package assignment_1;

import java.util.*;

public class Main_File {
	
	public static void main(String[] args)
	{
		Scanner scann = new Scanner(System.in);
		Main_Calculator calculator = new Main_Calculator();
		System.out.println("press 1 for Addition \n press 2 for Subtraction \n press 3 for Multiplication  \n press 4 for Divition \n press 5 for Modulus \n press 6 for absolute value ");
		int z=scann.nextInt();
		
	
		if(z==1)
		{
			System.out.println("\nEnter Two Numbers: ");
			double a=scann.nextDouble();
			double b=scann.nextDouble();
			System.out.println("Addition of two nember: " + calculator.addition(a,b));
		}
		
		else if(z==2)
		{
			System.out.println("\nEnter Two Numbers: ");
			double a=scann.nextDouble();
			double b=scann.nextDouble();
			System.out.println("Subtraction of two nember: " + calculator.subtraction(a,b));
		}
		
		else if(z==3)
		{
			System.out.println("\nEnter Two Numbers: ");
			double a=scann.nextDouble();
			double b=scann.nextDouble();
			System.out.println("multiplication of two nember: " + calculator.multiplication(a,b));
		}
		
		else if(z==4)
		{
			System.out.println("\nEnter Two Numbers: ");
			double a=scann.nextDouble();
			double b=scann.nextDouble();
			System.out.println("divition of two nember: " + calculator.divition(a,b));
		}
		
		else if(z==5)
		{
			System.out.println("\nEnter Two Numbers: ");
			int a=scann.nextInt();
			int b=scann.nextInt();
			System.out.println("modulus of two nember: " + calculator.modulus(a,b));
		}
		
		else if(z==6)
		{
			System.out.println("Enter the number ");
			double e=scann.nextDouble();
			System.out.println("absolute value: "+ calculator.absolutee(e));
		}
		
		else
		{
			System.out.println("System not Found");
		}
		
	}

}
