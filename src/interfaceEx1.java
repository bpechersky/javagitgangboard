interface inparent{
	int m1();
	void m2();
	void m3();
//	void m4() {
//		
//	}
}

abstract class interparent implements inparent{
	public int m1(){
		System.out.println("M1 Method");
		return 100;
	}
}

abstract class interparent1 extends interparent{
	public void m2(){
		System.out.println("M2 Method");
	}
}

public class interfaceEx1 extends interparent1{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
	System.out.println("M3 Method");	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceEx1 inEx1 = new interfaceEx1();
		inEx1.m1();
		inEx1.m2();
		inEx1.m3();

	}

	
}
