package GitDemo;

public class Addtwonumbers {
public static int add_num(int x,int y,int z) {
	int a=x+y;
	return a;
	//System.out.println(z);
}
public static int sub_num(int x,int y) {
	int a=x-y;
	return a;
	//System.out.println(z);
}
public static int mul_num(int x,int y,int z) {
	int a=x*y*z;
	return a;
	//System.out.println(z);
}
public static void main(String[] args) {
	System.out.println(add_num(3,3,3));
	System.out.println(sub_num(5,2));
	System.out.println(mul_num(5,2,6));
}
}
