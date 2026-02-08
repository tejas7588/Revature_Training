package basicproject;

import java.util.Scanner;

public class CountLowercase {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter string");
		 String str=sc.next();
		 
		 
		 int count=0;
		 int count1=0;
		 for(int i=0;i<str.length();i++) {
			 if(Character.isUpperCase(str.charAt(i))) {
				 count++;
				
				 }else {
					 count1++;
				 
			 }	 
				 
			 
		 }
		 System.out.println("no of uppercase element:"+count);
		 System.out.println("no of lowerase element:"+count1);
		 
	}


	

	
	}

