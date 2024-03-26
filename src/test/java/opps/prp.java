package opps;

public class prp {
static String ename;
static float salary;
static void set(String e,float s) {
	ename=e;
	salary=s;
}
static void get() {
	System.out.println(ename+" "+salary);
}
public static void main(String[] args) {
	prp.set("ppp",1.5f);
	prp.get();
}

}
