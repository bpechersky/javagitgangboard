abstract class ParentEx{
	abstract void m1();
	abstract void m2(); 
	abstract void m3();
	void m4() {
		System.out.println("M4 Method");
	}
}


public class abstractEx extends ParentEx{
	
	void m1() {
		System.out.println("M1 Method");
	}
	void m2() {
			System.out.println("M2 Method");
	}
	 void m3() {
			System.out.println("M3 Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ParentEx PEx = new ParentEx(); // Object creation is not possible
		
		abstractEx aEx = new abstractEx();
		aEx.m1();
		aEx.m2();
		aEx.m3();
		aEx.m4();
		
		ParentEx pEx = new abstractEx();
		pEx.m1();
		pEx.m2();
		pEx.m3();
		pEx.m4();
		
	}

}
