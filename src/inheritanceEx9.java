package inheritance;

class parentcons2{ // object class
	parentcons2(int a){
		//super(); executed by compiler object class constructor executed
		System.out.println("Parent 1-arg constructor = "+a); 
	}
}
public class inheritanceEx9 extends parentcons2{
	
	inheritanceEx9(){
		super(8); 
		System.out.println("Child 0-arg constructor");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new inheritanceEx9();
		

	}

}
