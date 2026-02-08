package basicproject;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks1:");
		int marks1=sc.nextInt();
		System.out.println("enter the marks2:");
		int marks2=sc.nextInt();
	float avg=(marks1+marks2)/2;
	System.out.println("avg marks:"+avg);
	if(avg>+35 && marks1>=35 && marks2>=35) {
		System.out.println("pass..........");
	}else {
		System.out.println("fail.......");
	}
		
		
	}
}
