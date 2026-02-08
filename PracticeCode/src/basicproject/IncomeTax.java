package basicproject;

import java.util.Scanner;

public class IncomeTax {
public static void main(String[] args) {
	
Scanner sc =new Scanner (System.in);
System.out.println("enter the income:");
float income=sc.nextFloat();
	float tax=0;
	
	
	if(income<2.5) {
		tax=tax+0;
	}if(income<=5 && income>2.5){
		tax=(float) (tax + 0.05*(income-2.5));
	}else if(income>5 && income<=10) {
		tax=(float) (tax+0.05f*(5.0f-2.5f));
		tax=(float) (tax + 0.05*(income-2.5));
	}
	else if(income>10) {
		
		tax=(float) (tax+0.05f*(5.0f-2.5f));
		tax=(float) (tax+0.05f*(10f-5.0f));
		tax=(float) (tax + 0.05*(income-2.5));
	}
	System.out.println("tax:"+tax);
	}
}
