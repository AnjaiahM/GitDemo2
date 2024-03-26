package Training_zensar;

class animal{
	animal(){
		System.out.println("animal con");
	}
	public void color() {
		System.out.println("animal has color");
	}
}

public class poly_riding_2  extends animal{
	
	poly_riding_2(){
		System.out.println("polyriding con");
	}
	public void color() {
		System.out.println("ddd");
	}
	public void dog() {
		System.out.println("dog gas red color");
	}
	public void cat() {
		System.out.println("cat gas red color");
	}
	public void lions() {
		System.out.println("lions gas red color");
	}
	public void tiger() {
		System.out.println("tiger gas red color");
	}
	public void rat() {
		System.out.println("rat gas red color");
	}
public static void main(String[] args) {
//	animal a1=new animal();
//	a1.color();
//	animal a=new poly_riding_2();
//	a.color();
//	poly_riding_2 p=new poly_riding_2();
//	p.color();
	
	poly_riding_2 p2=(poly_riding_2) new animal();
	p2.color();;
	p2.dog();
}
}
