package exceptionHandling;

import java.util.Scanner;

public class BasicExceptionHandling {

	public static void main(String[] args) {
		int x =1;
		
		do{
		
		try{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number");
		int num2 = sc.nextInt();
		
		int sum = num1/num2;
		System.out.println(sum);
		
		 x =2;
		}
		catch(Exception e){
			System.out.println("Wrong numbers entered");
			}
		}
		while(x==1);
			
	}

}
