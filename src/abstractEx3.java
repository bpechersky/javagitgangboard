abstract class abstractParent{
	abstractParent(){
		System.out.println("Abstract Constructor");
	}
	abstract void m1();
	
}

public class abstractEx3 extends abstractParent{
	
	abstractEx3(){
		//super();
		System.out.println("Child class Constructor");
	}
	
	void m1() {
		System.out.println("M1 Method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		abstractEx3 aEx3 = new abstractEx3();
//		aEx3.m1();
		new abstractEx3().m1();
		

	}

}


