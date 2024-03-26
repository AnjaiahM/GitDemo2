package Training_zensar;
 
class student{
	int rno;
	String address;
	student(int rn,String add){
		this.rno=rn;
		this.address=add;
	}
	final int o=10;
	static String college="aaa";
	void displa() {
		System.out.println(rno+" "+address+" "+college);
	}
	static void col() {
		//o=100;
		college="lll";
	}
}


public  class privateclass  {


public static void main(String[] args) {
	student s=new student(101,"aas");
	s.col();
	s.displa();
}



}

