package opps;

public class Indian implements traffic {

	@Override
	public void redsignal() {
		// TODO Auto-generated method stub
		System.out.println("30 sec");
		
	}

	@Override
	public void greensignal() {
		// TODO Auto-generated method stub
		System.out.println("30 sec");
	}
public static void main(String[] args) {
	Indian obj = new Indian();
	obj.redsignal();
	obj.greensignal();
	
}
}
