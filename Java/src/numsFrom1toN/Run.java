package numsFrom1toN;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// print numbers from 1 to N;
		Scanner sc = new Scanner(System.in);
		System.out.println("N = ");
		int n = sc.nextInt();
		
		int num = 1;
		while(num<=n) {
			System.out.println(num);
		num++;	
	}
		
  }
}
