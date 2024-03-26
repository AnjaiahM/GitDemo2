package opps;



class parent{
	public void show(){
		System.out.println("parent");
	}
	
}
class child extends parent{
	@Override
	public void show() {
		super.show();
		System.out.println("child");
	}
	
}

 class ply_riding {
	
public static void main(String[] args) {
	//child c=(child)new parent();
	parent c=new child();
	c.show();
	
}
}
