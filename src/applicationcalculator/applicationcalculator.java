package applicationcalculator;

import java.util.Scanner;

public class applicationcalculator {
	public static int add(int number1, int number2) {
		return number1 + number2;
	}
    public static int sub(int  number1, int number2) {
    	return (number1 - number2);
    }
    public static int mul(int number1, int number2) {
    	return number1*number2;
    }
    public static double div(double number1, double number2) {
    	if (number2 == 0) {
    		throw new IllegalArgumentException("Number can not be divide by 0");
    	}
    	
    	return number1 / number2;
    	
    }
    
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first number:");
	 int input = sc.nextInt();
	 
	 Scanner sc1 = new Scanner(System.in);
	 System.out.println("Enter second number:");
	 int input1 = sc.nextInt();
	 
	 System.out.println("the Addition is:" + applicationcalculator.add(input, input1));
	 System.out.println("the substraction is:" + applicationcalculator.sub(input, input1));
	 System.out.println("the multiplication is:" + applicationcalculator.mul(input, input1));
	 System.out.println("the division is:" + applicationcalculator.div(input, input1));
	 
 }
}
