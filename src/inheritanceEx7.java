package inheritance;

class parentconst1{  // object
	parentconst1(){
		// super
		System.out.println("parent class O-arg constructor----------");
	}
}

class parentcons extends parentconst1{
	parentcons(){
		//super
		System.out.println("parent class O-arg constructor");
	}
}

public class inheritanceEx7 extends parentcons{
	
	inheritanceEx7(){
		this(10,20); 
		System.out.println("child class O-arg constructor");
		
	}
	inheritanceEx7(int i, int j){
//		super();
		System.out.println("child class 2-arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new inheritanceEx7();
//		new inheritanceEx7(10,20);
		
	}

}
