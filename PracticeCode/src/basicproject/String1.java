package basicproject;

public class String1 {
	
	public static void main(String[] args) {
		String name="Tejas";
		name=name.toLowerCase();
		System.out.println(name);
		
		//problem 2
		String text="hii friends how are u";
		text=text.replace("  ", "-");
		text=text.replace("friends", "guys");
		System.out.println(text);
		
		//problem 3
		String letter="dear name,thanks a lot";
		letter=letter.replace("name", "harry");
		System.out.println(letter);
		
		//problem 4
		
		String mystring="this string contain  double    spaces";
		System.out.println(mystring.indexOf(" "));
		System.out.println(mystring.indexOf("  "));
		System.out.println(mystring.indexOf("   "));
		
		//problem 5
		
		String letter2="dear tejas, \n\t\t this java course is noice. \n\tthanks;";
		
		System.out.println(letter2);
		
	}

}
