package statements_executions;

public class javasteps_executions {
public static void main(String[] args) {
	javasteps_executions j=new javasteps_executions();
	j.s2();
	System.out.println("all s execution");
}
public void s0() {
	System.out.println("s0 execution");
	
}
public void s1() {
	System.out.println("s1  before execution");
	s0();
	System.out.println("s1 after execution");
}
public void s2() {
	System.out.println("s2 before execution");
	s1();
	System.out.println("s2 after execution");
}
}
