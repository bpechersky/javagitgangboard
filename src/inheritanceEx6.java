package inheritance;
//super class methods
class paarent1{
	void m1() {
		System.out.println("Parent M1 method-----");
	}
	
}

class parent2 extends paarent1{
	void m1() {
		System.out.println("Parent1 M1 method");
		super.m1();
	}
}

public class inheritanceEx6 extends parent2{
	
	void m1() {
		System.out.println("Child M1 method");
	}
	
	void m2() {
		this.m1();
		super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new inheritanceEx6().m2();
		new inheritanceEx6().m1();
	}

}
