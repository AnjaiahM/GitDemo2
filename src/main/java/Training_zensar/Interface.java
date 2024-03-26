package Training_zensar;

interface Bank{
	
	public float rateOFInterest(); 
}
interface sky{
	
}
interface shape extends Bank,sky{
	final int a=10;
	static int b=10;
	default void ee() {
		System.out.println("ee");
	}
	static void ss() {
		System.out.println("ss");
	}
	public int sides(); 
	public float rateOFInterest(); 
}

class SBI implements Bank,shape{
	
	@Override
	public float rateOFInterest() {
		return 5.5f;
		
		
	}
	
	@Override
	public int sides() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}
class ICICI implements Bank{

	public float rateOFInterest() {
	return 6.1f;	
	}
	
}

public class Interface {
public static void main(String[] args) {
	
	
	SBI b=new SBI();
	
	System.out.println(b.rateOFInterest());
	
}
}
