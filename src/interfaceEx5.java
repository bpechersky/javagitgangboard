class x1{
	interface aaa1{
	void m1();	
	}
	
}


public class interfaceEx5 implements x1.aaa1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceEx5 iEx5 = new interfaceEx5();
		iEx5.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	System.out.println("M1 Method");	
	}

	

}
