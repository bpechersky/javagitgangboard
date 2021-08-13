package inheritance;
class parentcons6{
	
	parentcons6(){
		System.out.println("Parent class 0-arg constructor ");
	}
}

public class inheritanceEx13 extends parentcons6{

//	inheritanceEx13(){ compiler generates the code
//	 super();	
//	}
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new inheritanceEx13();
	}

}
