package Strings;

public class removewhitespace {
	public static void main(String[] args) {

		String s = "jljs lkdsjkflsdj poipioip";
		s = s.replaceAll(" ", "");
		System.out.println(s);

		char[] c = s.toCharArray();
		String ss = "";

		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				ss = ss + c[i];
			}
		}

		System.out.println(ss);

		// merge
		String sr = mergeString("sel", "jav");
		System.out.println(sr);

		
		//specific word occur
				find_num_occr_word("spec is spec epic in epic spec","spec");
				
				//string comparision
				stringcompa();
	}

	public static String mergeString(String s1, String s2) {
		int i = 0;
		int j = 0;
		String sm = " ";
		while (i < s1.length() && j < s2.length()) {

			sm = sm + s1.charAt(i) + s2.charAt(j);
			i++;
			j++;
		}
		
//		while(i>s1.length()||j<s2.length()) {
//			sm=sm+s2.charAt(i);
//			j++;
//		}
//		while(j>s2.length()||i<s1.length()) {
//			sm=sm+s1.charAt(i);
//			j++;
//		}
		
		
		
	//	System.out.println(sm);
		return sm;

		
	}
	
	
	
	public static void find_num_occr_word(String str,String ser) {
		String [] sa=str.split(" ");
		System.out.println("No of words "+sa.length);
		
		System.out.println("Lenth of actual string "+str.length());
		System.out.println("length of word "+ser.length());
		int  lengthofreplace=str.replaceAll(ser, " ").length();
		
		int specific_word =((str.length()-lengthofreplace)/ser.length());
		System.out.println("ser word occur is "+specific_word);
		}
	
	
	public static void stringcompa() {
		String s1="india";
		String s2="india";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("india");
		String s4=new String("india");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		StringBuffer sb1=new StringBuffer("india");
		StringBuffer sb2=new StringBuffer("india");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		StringBuffer sb3=sb1;
		System.out.println(sb1==sb3);
		System.out.println(sb1.equals(sb3));
		
		StringBuffer sb5=new StringBuffer(s1);
		//System.out.println(s1==sb5);
		System.out.println(s1.equals(sb5));
		
		
		
		
		
	}
}
