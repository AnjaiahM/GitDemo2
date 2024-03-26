package Strings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class string_initial {
public static void main(String[] args) {
	byte[] b= {65,66,67};
	String s=new String(b);
	System.out.println(s);
	
	byte[] b1= {97,98,99};
	String s1=new String(b1);
	System.out.println(s1);
	
	byte[] b2= {2,66,67};
	String s2=new String(b2);
	System.out.println(s2);
	
	
	char[] c= {'a','c'} ;
	String sc=new String(c);
	System.out.println(sc);
	
	String sf="se le ni";
	StringTokenizer st=new StringTokenizer(sf,"");
	System.out.println(st);
	
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		
		
	}
	
	
	String ss="National occupacy";
	ss=ss.substring(1,ss.length()-1);
	System.out.println(ss);
	
	StringBuffer sb=new StringBuffer(ss);
	sb.delete(0, 1);
	sb.delete(ss.length()-1, ss.length());
	System.out.println("ss "+sb.toString());
	
	
	String p1="pooop";
	String temp="";
	//String p2="pooop";
	for(int i=p1.length()-1;i>=0;i--) {
		temp=temp+p1.charAt(i);
	}
	System.out.println(temp);
	
	
	//string compare
	
	
	String cm1="asking";
	String cm2="ingask";
	cm1=cm1.toLowerCase();
	cm2=cm2.toLowerCase();
	
	char[] c1=cm1.toCharArray();
	char[] c2=cm2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	boolean status=Arrays.equals(c1,c2);
	
	System.out.println(status);
	
	if(cm1.length()==cm2.length()) {
		System.out.println("two string are not equal");
	}else {
		if(status) {
			System.out.println("two string same");
		}else {
			System.out.println("not same");
		}
	}
	
	
	
	
	
	
	
}
}
