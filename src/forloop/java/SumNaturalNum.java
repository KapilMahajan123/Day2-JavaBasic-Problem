package forloop.java;

public class SumNaturalNum {
	public static void main(String[] args) {
		int i, num = 5, sum = 0;
		
		for (i=1; i<=num; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum of first natural numbers is = " + sum);
	}

}
