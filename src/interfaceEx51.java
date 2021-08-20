class x11{
	interface aaa1{
	void m1();	
	}
	interface aaa2{
		void m2();	
		}	
}


public class interfaceEx51 implements x11.aaa1,x11.aaa2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfaceEx51 iEx51 = new interfaceEx51();
		iEx51.m1();
		iEx51.m2();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	System.out.println("M1 Method");	
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 Method");		
	}

}
