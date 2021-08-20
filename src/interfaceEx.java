interface Parent{   // abstract
	
	void m1();      // public abstract
	void m2();      // public abstract
	void m3();      // public abstract
	abstract void m4();
//	void m14(){
//
//	}
}

public class interfaceEx implements Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfaceEx iEx = new interfaceEx();
		iEx.m1();
		iEx.m2();
		iEx.m3();
		iEx.m4();
		
		Parent iEx1 = new interfaceEx();
		iEx1.m1();
		iEx1.m2();
		iEx1.m3();
		iEx.m4();
		
//		Parent iEx11 = new Parent();
				
	}

	@Override
	public void m1() { 
		// TODO Auto-generated method stub
		System.out.println("M1- Method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2- Method");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3- Method");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("M4- Method");
	}

}
