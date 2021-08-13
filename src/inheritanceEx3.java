package inheritance;

class A1{ //parent base super
	void mm1() {
		System.out.println("A1");
	}
	void mm2() {}
}
class B11 extends A1{ // child subclass derived
	void mm1() {
		System.out.println("B1");
	}
	void mm2() {}
}
class C1 extends B11,A1{ // NOT ALLOWED MULTIPLE INHERI
	void mm5() {}
	void mm6() {}
}


public class inheritanceEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C1 C = new C1();
		C.mm1();

//		B11 b = new B11();
//		b.mm1();
	}

}
