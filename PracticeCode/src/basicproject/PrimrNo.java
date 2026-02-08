package basicproject;

import java.util.Scanner;

public class PrimrNo {
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
			count++;
			
		}
		if(count==2) {
			System.out.println(n+" is prime no");
		}else {
			System.out.println(n+ "  is not prime no");
		}
		
	}
	
 

}
