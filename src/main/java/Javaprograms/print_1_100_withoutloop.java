package Javaprograms;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class print_1_100_withoutloop {
//public static void main(String[] args) {
//	//printnum(1);
//}


//recurssion
@Test
public void print_1_100_without_loop() {
	//printnum(1,100);
	
	//IntStream.range(1, 100).forEach(p->System.out.println(p));
	
	int a= 'a'/'a';
	printnum0(a);
	
}

public  void printnum0(int num) {
	
	//num='a'/'a';
	String s="..........";
	if(num<=s.length()*s.length()) {
		System.out.println("lll  "+num);
		num++;
		printnum0(num);
	}
	
}
public  void printnum(int st,int end) {
	
	if(st<=end) {
		System.out.println(st);
		st++;
		printnum(st,end);
	}
	
}

@Test
public void print_1_100_no_num() {
	int one='a'/'a';
	
	String s="..........";
	
	
	for(int i=one;i<=s.length()*s.length()-3*one;i++) {
		System.out.println(i);
	}
}


@Test
public void aausingacci() {
	
	int a='a'/'a';
	do {
		System.out.println("pp "+a);
		a++;
		
	}while(a<='d');
	
}



@Test
public void Using_Arrays() {
	Object[] num=new Object[100];
	Arrays.fill(num, new Object() {
		int count=1;
		
		public String toString() {
			
			return Integer.toString(count); 
		}
	}
	
			);
	System.out.println(Arrays.toString(num));
	
}
}
