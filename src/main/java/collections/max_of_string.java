package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class max_of_string {
public static void main(String[] args) {
	
	List<String> li=Arrays.asList("apple","bananna","pinaple","zam","sitapal");
	String ss=li.stream().collect(Collectors.maxBy(Comparator.comparingLong(String::length))).get();
	System.out.println(ss);
}
}
