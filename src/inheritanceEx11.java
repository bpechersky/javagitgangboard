package inheritance;

class parentcons4{
	parentcons4(){
		//super(); executed by compiler object class constructor executed
		System.out.println("Parent 0-arg Constructor");
	}
}

public class inheritanceEx11 extends parentcons4 {
	inheritanceEx11(){
		//super(); executed by compiler
		System.out.println("Child 0-arg Constructor");
	}
	inheritanceEx11(int a){
		//super(); executed by compiler
		System.out.println("Child 1-arg Constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new inheritanceEx11();
		new inheritanceEx11(10);
	}

}
