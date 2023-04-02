package ifelse.java;

import java.util.Scanner;

public class DisplayUnit {
	
		public static void main(String[] args) {
		
			System.out.println("Enter the number:1, 10, 100, 1000 :");
			Scanner scan = new Scanner(System.in);  
			int num = scan.nextInt(); 

				if (num == 1) {
					System.out.println("Ones place digit");
				} else if (num == 10) {
					System.out.println("Tens place digit");
				} else if (num == 100) {
					System.out.println("Hundred place digit");
				} else if (num == 1000) {
					System.out.println("Thousand place digit");
				} else{
					System.out.println("Wrong Input....");
				}

		}

}
