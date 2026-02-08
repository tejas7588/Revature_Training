package basicproject;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter agee:");
		int age=sc.nextInt();
		if(age>56) {
			System.out.println("u are experienced");
		}else if(age>46) {
			System.out.println("u are semi experienced");
		}
		else if(age>36){
			System.out.println("u are semi semi experienced");
			
		}else {
			System.out.println("u are not experienced");
		}
	}

}
