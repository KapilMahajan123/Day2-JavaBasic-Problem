package switchstatement.java;

import java.util.Scanner;

public class CheckVowelorConstant {
	
	public static void main(String[] args) {
		System.out.println("Enter Character:  ");
		
		Scanner scan = new Scanner(System.in);
		char alphabets = scan.next().charAt(0);
		
		switch (alphabets)
		{
		case 'A':
			System.out.println("Vowel = A");
			break;
			
		case 'E':
			System.out.println("Vowel = E");
			break;
			
		case 'I':
			System.out.println("Vowel = I");
			break;
			
		case 'O':
			System.out.println("Vowel = O");
			break;
		
		case 'U':
			System.out.println("Vowel = U");
			break;
			
		default :
			System.out.println("This Is A Consonant");

		
		}
		
	}

}
