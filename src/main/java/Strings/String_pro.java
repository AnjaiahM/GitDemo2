package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_pro {
	public static void main(String[] args) {

		String sr = "Eroplane machine";
		String str = rev_stbuffer(sr);
		System.out.println(str);

	Character c=	rev_Eachword_int_String(str);
System.out.println(c);

boolean b=palindrom("lool");
System.out.println(b);


//repeated word in string
String s="set of values in a string is a string of set of values";

String []srr= new String[]{"s","l","p","o","h","l","p"};
num_of_words_string(s);

num_of_words_string_array(srr);


	}



//Stringrev

	static StringBuffer sb;

	public static String rev_stbuffer(String str) {
//	
//sb=new StringBuffer(str);
//return sb.reverse().toString();
//	
		String rev = "";

		char[] c = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			// rev=rev+str.charAt(i);
			rev = rev + c[i];

		}
		return rev;

	}

	public static Character rev_Eachword_int_String(String str) {
		String st[] = str.split(" ");
		System.out.println(st.length);
         Character c = 0;
//		for (int i = 0; i < st.length; i++) {
//			System.out.println(i);
//			System.out.println(st[i]);
//
//			for (int j = st[i].length() - 1; j >= 0; j--) {
//
//				System.out.print(st[i].charAt(j));
//
//			}
//		}
         int i;
         int j;

		for ( i = 0; i < st.length; i++) {
			//System.out.println(i);
			System.out.println();
			System.out.println(st[i]);
			for ( j = st[i].length()-1 ; j >= 0; j--) {

				System.out.print(st[i].charAt(j));
             c=st[i].charAt(j);
			}
		}
		return c;
		
		
		
		
	}
	
	public static boolean palindrom(String str) {
		String temp=str;
		String rev="";
		boolean b=true;
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			if(str.equals(rev)) 
				
			
			return b;
			
		}
		System.out.println(rev);
		return false;
		
	}
	
	public static void num_of_words_string(String str) {
		
		HashMap<String, Integer> hm=new HashMap<>();
		String [] st=str.split(" ");
		for(String s:st) {
			if(hm.containsKey(s)){
				hm.put(s, hm.get(s)+1);
			}else {
				hm.put(s, 1);
			}
			
		}
		System.out.println(hm);
		}
	
	private static void num_of_words_string_array(String[] srr) {
		HashMap<String, Integer> hm=new HashMap<>();
		
		for(String s:srr) {
			
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}else {
				hm.put(s, 1);
			}
			
			
		}
		System.out.println(hm);
		
//		Set<String> sk= hm.keySet();
//		
//		for(String s:sk) {
//			if(hm.get(s)>1) {
//				System.out.println("duplicate word  "+s+" occurs"+hm.get(s)+"times");
//			}
//		}
		
		
//		hm
//        .values()
//        .stream()
//        .collect(
//                Collectors.groupingBy(Function.identity(), 
//                        HashMap::new, 
//                        Collectors.counting())
//                );
		
		
//		hm.values().stream().collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));
//		
//	
//	hm.keySet().stream().forEach(p->System.out.println(p));
//	
//	hm.entrySet().stream().filter(p->p.getValue()>1).forEach(System.out::println);
		
		Set<Entry<String, Integer>>  sr=hm.entrySet();
		for(Entry<String, Integer> s:sr) {
			if(s.getValue()  >1) {
				System.out.println("duplicate word "+s.getKey()+" occcured "+s.getValue());
			}
		}
		
		Set<String> dup=hm.keySet();
		for(String d:dup) {
			if(hm.get(d)>1) {
				System.out.println("duplicate word "+hm.get(d)+" occured "+hm.get(d)+" times");
			}
		}
	}

}
