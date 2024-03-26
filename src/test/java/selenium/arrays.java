package selenium;

 public class arrays {
public static void main(String[] args) {
	
	student[] st=new student[] {new student("abc"),new student("pla")};
	for(int i=0;i<st.length;i++) {
		System.out.println(st[i].toS());
	}
	
	
	Employee []emp=new Employee[5];
	emp[0]=new Employee("admin",1);
	emp[1]=new Employee("manager",2);
	emp[2]=new Employee("clark",3);
	emp[3]=new Employee("ceo",4);
	emp[4]=new Employee("authority",5);
	for( Employee e:emp) {
		//System.out.println(e.name+" "+e.empnum);
		System.out.println(e.toS()+" "+e.toI());
	}
}
}
  class student{
	  String name;
	  student(String name){
		  this.name=name;
	  }
	  public String toS() {
		  return name;
	  }
  }
  
  
  //2
  class Employee{
	  String name;
	  int empnum;
	  Employee(String name,int empnum){
		  this.name=name;
		  this.empnum=empnum;
	  }
	  public String toS() {
		  return name;
	  }
	  public int toI() {
		  return empnum;
	  }
  }
