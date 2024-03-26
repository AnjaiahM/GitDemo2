package javabasicprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Largetsof_3_num {
public static void main(String[] args) {
	
}

	@Test
public void largest_3_Num() {
	int x=10,y=5,z=10;
	System.out.println( z>(x>y?x:y)?z:((x>y)?x:y));
	
	m("aro","pla");
	
}
	
	
	public void m(String s1,String s2) {
		s1=s1.concat(s2);
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.reverse().toString());
	}
	
	
	@Test
	public void swap() {
		
		
		
		
		int m=5,n=9;
		m=m-n;  //m=-4
		n=m+n;  // n=-4+9=5
		m=n-m;   //5-(-4)=9
		System.out.println(m+" "+n);
	}
	
	
	@Test
	public void number_devied_devide_0(){
		System.out.println(0.0/0.0);  //Nan
		System.out.println(0.0/0); //NaN
		try{
		System.out.println(0/0);  //arithmetic execption  //unchecked
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println(9.0/0);  //infinity
		}
		System.out.println(15.09f/0);  //inf
		System.out.println(16.009d/0);  //infin
		System.out.println(16.009d/0.0);  //infin
  	}
	
	
	@Test
	public void duplicateEle() {
		String []in={"pen","glass","glass","pen","robber","pen"};
//		Arrays.asList(in).stream().distinct().forEach(p->System.out.println(p));
//		System.out.println(Arrays.asList(in).stream().distinct().count());
		
		HashMap<String, Integer> ha=new HashMap<String,Integer>();
		
		for(String s:in) {
			if(ha.containsKey(s)) {
				ha.put(s, ha.get(s)+1);
			}else {
				ha.put(s, 1);
			}
		}
		System.out.println(ha);
		
		
		////keyset
	Set<String> see=	ha.keySet();
//	for(String s:see) {
//		if(ha.get(s)>1) {
//			System.out.println(s+" "+ha.get(s));
//		}
//	}
	
	//entryset
	
//		Set<Entry<String,Integer>> ss= ha.entrySet();
//		for(Entry<String,Integer> s:ss) {
//			if(s.getValue()>1) {
//			System.out.println(s.getKey()+" "+s.getValue());
//			}
//		}
		
		
		
		
		//Using hashset
		
		
//		Set<String> se=new HashSet<String>();
//		for(String s:in) {
////			if(se.add(s)==false) {
////				System.out.println(s);
////				}
//			se.add(s);
//		}
//		System.out.println(se);
		
		
		
		//bruteforse
		
		
//		for(int i=0;i<in.length;i++) {
//			for(int j=i+1;j<in.length;j++) {
//				
//				if(in[i].equals(in[j])) {
//					System.out.println(in[i]);
//				}
//				
//			}
//		}
	}
	
	@Test
	public void duplicatechar_string() {
		String s="string is class";
		 char[] ch=s.replace(" ", ""). toCharArray();
		 HashMap<Character,Integer> ha=new HashMap<>();
		 for(Character c:ch) {
			 if(ha.containsKey(c)) {
				 ha.put(c, ha.get(c)+1);
			 }		 else {
				 ha.put(c, 1);
			 }
		 
		 }
		
//
//		 Set<Character> sc= ha.keySet();
//		 for(Character sc1:sc) {
//			 
//			 if(ha.get(sc1)>1) {
//				 System.out.println(sc1+" "+ha.get(sc1));
//			 }
//			 }
//		 
		 Set<Entry<Character,Integer>> ses= ha.entrySet();
		 for(Entry<Character,Integer> se:ses) {
			 if(se.getValue()>1) {
				 System.out.println(se.getKey()+" "+se.getValue());
			 }
		 }
		 
	}
	
	
	//specified character 
	@Test
	public void char_occurance() {
		
		String s="string is a class";
		long con=s.chars().mapToObj(p-> String.valueOf((char)p)).filter(p->p.equals("s")).count();
		System.out.println(con);
		
		
		
	}
	
	
	//first lette of each word
	
	@Test
	public void firstLetterof_each_word() {
		String s="String is A ClaSs";
		Pattern p=Pattern.compile("\\b[a-zA-Z]");
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}
	//insert string in anether
	@Test
	public void insertString_outerString() {
		String s="String is a class";
		System.out.println(new StringBuffer(s).insert(2, "java").toString());
	}
	
	//min max values
	@Test
	public void min_max_value() {
		
		Integer[] i= {2,6,9,15,10,6,3};
		 List<Integer> li=Arrays.asList(i);
		 
		 Collections.sort(li);
		 System.out.println(li);
		 
		 System.out.println(Collections.max(li)+" "+Collections.min(li));
		 
		 System.out.println("string \"\bmin\"");
		
	}
	
	@Test
	public void retrive_special_() {
	
		String s="ABC@#&98077";
//		System.out.println(s.replaceAll("[!@#$%^&*()_+a-zA-Z]", ""));
//		System.out.println(s.replaceAll("[1234567890!@#$%^&*()_+]", ""));
//		System.out.println(s.replaceAll("[a-zA-Z1234567890]", ""));
		
		StringBuffer alpha=new StringBuffer();
		StringBuffer digit=new StringBuffer();
		StringBuffer special=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			
			if(Character.isAlphabetic(s.charAt(i))) {
				alpha.append(s.charAt(i));
			}else if(Character.isDigit(s.charAt(i))) {
				digit.append(s.charAt(i));
			}else special.append(s.charAt(i));
			
		}
		System.out.println(digit);
		System.out.println(alpha);
		System.out.println(special);
	}
	
	
	
	
}
