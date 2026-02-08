package basicproject;

public class pattern {
    
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n) {
//        for (int row = 0; row <= n; row++) {
//            for (int col = 0; col <= row; col++) {
//                System.out.print("*");
//            }
//                System.out.println(); // Moves to the next line after printing stars for the row
//        }
    	
    	for(int i=0;i<=n;i++) {
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    			
    		}
    		System.out.println();
    	}
    	for(int i=4;i>=0;i--) {
    		for(int j=0;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
