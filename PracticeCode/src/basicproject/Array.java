package basicproject;

public class Array {
	public static void main(String[] args) {
		
		// array is collection of similar type of data
		// int [] marks;
		//accesing element in array is faster
		//4 byte of memory
		// index start from 0 to 1
		/*  */
		int[] marks;
		marks=new int[5];
		
		marks[0]=100;
		marks[1]=99;
		marks[2]=98;
		marks[3]=97;
		marks[4]=96;
		//marks[5]=95;
		//System.out.println(marks[4]);
		
		int [] marks1= {10,20,30,40,50,60};
		//+System.out.println(marks1[6]);
		//System.out.println(marks1.length);
		
		for(int i=0;i<marks1.length;i++) {
			System.out.println(marks1[i]);
		}
		System.out.println();
		for(int i=marks1.length-1;i>=0;i--) {
			System.out.println(marks1[i]);
		}
		System.out.println();
		for(int elements:marks1) {
			System.out.println(elements);
		}
	}

}
