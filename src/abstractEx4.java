abstract class abstractparent1{
	abstractparent1(){
		System.out.println("abstract class constructor");
	}
	{
		System.out.println("abstract class instance block");
	}
	static {
		System.out.println("abstract class static block");
	}
}

public class abstractEx4 extends abstractparent1{
	static {
		System.out.println("child class static block");
	}
	{
		System.out.println("child class instance block");
	}
	abstractEx4(){
		//super();
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new abstractEx4();
		new abstractEx4();
		
	}

}
