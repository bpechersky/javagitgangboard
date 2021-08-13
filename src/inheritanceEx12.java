package inheritance;

class parentcons5{
//	parentcons5(){
//		System.out.println("Parent class 0-arg constructor");
//	}
	parentcons5(int b){
		System.out.println("Parent class 1-arg constructor");
	}
	
}

public class inheritanceEx12 extends parentcons5{
	inheritanceEx12(){
 super(10);
		System.out.println("child class 0-arg constructor");
	}
	inheritanceEx12(int a){
		 super(100);
		System.out.println("child class 1-arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		new parentcons5(); 
		new inheritanceEx12();
		new inheritanceEx12(5); 
		//new parentcons5(10); 
	}

}
