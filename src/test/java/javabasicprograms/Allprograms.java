package javabasicprograms;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Allprograms {
	@Test
public void leapyear_find() {
	Scanner sc=new Scanner(System.in);
	int num= sc.nextInt();
	if((num%400==0)||((num%4==0&&num%100!=0))) {
		System.out.println("leap year");
	}else {
		System.out.println("non leap year");
	} 
}
	
	@Test
	public void polindram() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int r=0,sum=0,temp;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		if(temp==sum) 
			System.out.println("polindram");
		else
			System.out.println("not polindram");
	}
	
	@Test
	public void factorial() {
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		 for(int i=num-1;i>0;i--) {
//			 num=num*i;
//		 }
//		 System.out.println(num);
		System.out.println(fact(5));
		
	}
	
	public int fact(int f) {
		if(f==0 || f==1)
			return 1;
		//return fact(f)*fact(f-1);
		return f*fact(f-1);
		
	}
	
	@Test
	public void UrL() throws MalformedURLException {
		URL url=new URL("https://www.google.com");
	try {
		int l=	url.openConnection().getContentLength();
		System.out.println(l);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
