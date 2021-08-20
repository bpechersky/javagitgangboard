abstract class ParentEx1{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
}

 abstract class ParentEx2 extends ParentEx1{ 
	void m1() {
		System.out.println("Mi Method...");
	}
}

abstract class ParentEx3 extends ParentEx2{ 
	void m2() {
		System.out.println("M2 Method...");
	}
}
//
abstract class ParentEx4 extends ParentEx3{
	void m3() {
		System.out.println("M3 Method...");
	}
//	
}


public class abstractEx1 extends ParentEx4{
	void m4() {
		System.out.println("M4 Method...");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abstractEx1 aEx1 = new abstractEx1();
		aEx1.m1();
		aEx1.m2();
		aEx1.m3();
		aEx1.m4();
	}

}
