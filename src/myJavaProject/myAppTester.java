 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.print("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is: ");
	  reverseMethod(n);
	  System.out.println();

	  // add a line below to call your myTestMethod from here  then remove the block comment symbols  
	  System.out.print("Input a number to check if it is even or odd and its factorial value: ");
	  int value = input.nextInt();
	  myTestMethod(value);
	  System.out.println("\n\n*** Done ***");
	  System.out.println("*** Have a great day! ***");
	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }

	// add your test method in this space then remove the block comment symbols
	public static void myTestMethod(int val) {
		if (val % 2 == 0)
		{
			System.out.println("The value " +  val + " is EVEN");
			System.out.println("The factorial is " + factorial(val));
		}
		else
		{
			System.out.println("The value " +  val + " is ODD");
			System.out.println("The factorial is " + factorial(val));
		}
	}
	
	public static long factorial(int val)
	{
		if (val == 0 || val == 1)
			return 1;
		else
			return val * factorial(val-1);
	}
}