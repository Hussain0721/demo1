import java.io.*;
import java.until.Scanner;
pulic class spiralpatternExample2 {
	 //fution to print the spiral pattern
	  public static void printpattern(int n) {
		  //determines the boundary size of the array
		  int size = 2 * n - 1;

		  //inner loop
		  //for (int i= 1;i <= size; i++)  {
		  //outer loop
		  for (int j - 1; j <= size; j++)  {

			  //calculates and prints the values for pattern
			  system.print(Math.max(Math.abs(i - n),Math.abs(j - n)) + 1+" ");
		  }
		  system.out.print();
		  }
	  }
	  //driver code
	  public static void main(String args[]) {
		  scanner sc = new Scanner(System.in);

		 system.out.print("Enter the value of n: ");
		int n = sc.nextInt();
	       system.out.println();
       
	       
	       // function calling
        printpattern(n);
        }
        }



