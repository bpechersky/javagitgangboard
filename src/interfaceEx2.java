// interface vs inheritance

interface it1{
	void m1();
}

interface it2 extends it1{
	void m2();
}

interface it3 extends it2{
	void m3();
}

//public class interfaceEx2 implements it1{
//public class interfaceEx2 implements it2{

public class interfaceEx2 implements it3{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfaceEx2 iEx2 = new interfaceEx2();
		iEx2.m1();
		iEx2.m2();
		iEx2.m3();
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
