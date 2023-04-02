package forloop.java;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to check Palindrome");
		int n = scan.nextInt();
		int rev = 0; 
		int rem ; 
		int temp = n;
		System.out.println("Actual Number: "+ n+"");

		for(int i=n ; i > 0; )
		{
			rem = i % 10 ;
			rev = rev * 10 + rem;
			i = i / 10;

		}	
		System.out.println("Reversed Number is: "+ rev+"\n");
		if(temp == rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	 }

}
