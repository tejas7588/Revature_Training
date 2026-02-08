package basicproject;

import java.util.Scanner;

public class ConditionalStatement {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur age");
		int age=sc.nextInt();
		if(age>21) {
			System.out.println("you can vote");
		}else {
			System.out.println("can not vote");
		}
	}
}
