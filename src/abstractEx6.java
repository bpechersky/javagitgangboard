// without abstract class abstract method declaration is not possible

abstract class aaa{
	abstract void m1();
	int i=10;
}

public class abstractEx6 extends aaa{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abstractEx6 aEx6 = new abstractEx6();
		aEx6.m1();

	}

	
	void m1() {
		// TODO Auto-generated method stub
		int i = 20;
		System.out.println("i Value = "+i);
		System.out.println("i Value = "+super.i); 
		super.i = super.i+100;
		System.out.println(super.i); 
		i = i+10;
		
		System.out.println("i Value = "+i);
		
	}

}
