interface aa1{
	void m2();

	interface aa2{
		void m1();
	}
}

public class interfaceEx4 implements aa1,aa1.aa2{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new interfaceEx4().m1();
       new interfaceEx4().m2();
       
       
       
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
