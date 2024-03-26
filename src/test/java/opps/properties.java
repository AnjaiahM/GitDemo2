package opps;

public class properties {
	
	public String name;
	public float salary;
	public properties(String name,float f) {
		this.name=name;
		this.salary=f;
	}
	
	public String getname() {
		//System.out.println(name+" "+f);
 		return name;
	}
	public float getSalary() {
		//System.out.println(name+" "+f);
		return salary;
	}
public static void main(String[] args) {
	properties p=new properties("ppp",1.2f);
	String mm=p.getname();
	float sal=p.getSalary();
	System.out.println(mm+" "+sal);
}
}
