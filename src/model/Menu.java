package model;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();


		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Make your choice : '+' for add | '-' for minus' ");

		char choice = scanner.next().charAt(0); 
		
		System.out.println("Enter the number");

		double nb = scanner.nextDouble();
		scanner.close();

		switch (choice)
		{
		case '+' : 	calc.add(nb);
		break;
		case '-' : calc.minus(nb);
		}
		System.out.print(calc.getResultat());
	}

}
