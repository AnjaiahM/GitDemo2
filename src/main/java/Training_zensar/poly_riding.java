package Training_zensar;
class bike{
	int speed=100;
}
public class poly_riding extends  bike{
int speed =200;
public static void main(String[] args) {
	bike b=new poly_riding();
	System.out.println(b.speed);
}
}
