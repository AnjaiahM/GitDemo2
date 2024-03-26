package Training_zensar;
class privatemem{
	private int p=77;
	private String name;
	private int id;
	
	//
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
		
	}
	public void setId1(int p) {
		this.p=99;
	}
	public int  getP() {
		return p;
	}
} 
public class private_data_members {
public static void main(String[] args) {
	
	
	
	privatemem pp;
	pp=new privatemem();
	
	pp.setName("sel");
	System.out.println(pp.getName());
	pp.setId(10);
	System.out.println(pp.getId());
	System.out.println(pp.getP());
}
}
