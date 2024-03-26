package selenium;

public class returningarray {
public static void main(String[] args) {
	int[] i1=m1();
	for(int i=0;i<i1.length;i++) {
		System.out.println(i1[i]);
	}
	System.out.println(i1.getClass().getSuperclass());
}
public static int[] m1() {
	return new int[] {2,5,6};
	
}
}
