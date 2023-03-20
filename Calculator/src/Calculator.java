import java.util.Scanner;

public class Calculator
	{
	public static void main(String[] args)
		{
		Scanner userIntInput = new Scanner(System.in);
		Scanner userDoubleInput = new Scanner(System.in);
		System.out.println("Please enter your first number.");
		double firstNumber = userDoubleInput.nextDouble();
		System.out.println("Please enter your second number.");
		double secondNumber = userDoubleInput.nextDouble();
		System.out.println("\nWhich operation would you like to perform?");
		System.out.println("\t(1) add");
		System.out.println("\t(2) subtract");
		System.out.println("\t(3) multiply");
		System.out.println("\t(4) divide");
		int operation = userIntInput.nextInt();
		System.out.print("Your answer is ");
		
		if(operation == 1)
			System.out.println(add(firstNumber, secondNumber));
		else if(operation == 2)
			System.out.println(subtract(firstNumber, secondNumber));
		else if(operation == 3)
			System.out.println(multiply(firstNumber, secondNumber));
		else if(operation == 4)
			System.out.println(divide(firstNumber, secondNumber));
		}
	
	public static double add(double x, double y)
		{
		return x + y;	
		}
	
	public static double subtract(double x, double y)
		{
		return x - y;	
		}
	
	public static double multiply(double x, double y)
		{
		return x * y;	
		}
	
	public static double divide(double x, double y)
		{
		return x / y;	
		}
	}
