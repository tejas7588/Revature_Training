package basicproject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("tejas","pooja","mahi");
		Stream<String> mystream=list.stream();
		
		String[] array= {"apple","mango","banana"};
		Stream<String> stream=Arrays.stream(array);
		
		Stream<Integer> mystream1= Stream.of(1,2,3);
		Stream.iterate(0,n->n+1).limit(100);
		
		
 	}

}
 