// multiple inheritance

interface a1{
	void m1();
}
interface b1 extends a1{
	void m2();
	void m1();
}
interface c1 extends a1,b1{
	void m1();
	void m3();
}
public class interfaceEx3 implements c1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		interfaceEx3 iEx3 = new interfaceEx3();
		iEx3.m1();
		iEx3.m2();
		iEx3.m3();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1 Method...");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 Method...");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3 Method...");
	}

}
