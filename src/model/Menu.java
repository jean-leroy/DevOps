package model;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		boolean quit = false;
		char choice;
		double nb;


		
		
		do {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nMake your choice : \n'+' for add \n '-' for minus' \n'*' for multiply \n '/' for divide \n 'q' to quit");

		choice = scanner.next().charAt(0); 
		
		System.out.println("Enter the number");

		 nb = scanner.nextDouble();

		switch (choice)
		{
			case '+' : 	calc.add(nb);
						break;	
			case '-' : calc.minus(nb);
						break;
			case '*' : calc.multiply(nb);
						break;
			case '/' : calc.divide(nb);
						break;
			case 'q' : quit=true;
			scanner.close();

		}

		System.out.print(calc.getResultat());
		
		
	} while (!quit);
	}

}
