package basicproject;

import java.util.Scanner;

public class SwitchCase {
	
	
	public static void main(String[] args) {
		System.out.println("enter age :");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		switch(age) {
		
		case 18:
			System.out.println("u are teen ager");
			break;
		case 21:
			System.out.println("u are now good ager");
			break;
			default:
				System.out.println("enjoy ur life");
				break;
		}
	}
	

}
