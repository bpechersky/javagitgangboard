package inheritance;

class parentinheritance4{
	{
		System.out.println("Parent class instance block...");
	}
	parentinheritance4(){
		System.out.println("Parent class Constructor...");
	}
	static{
		System.out.println("Parent class static block...");
	}
	
}

public class inheritanceEx18 extends parentinheritance4{
	
	{
		System.out.println("Child class instance block...");
	}
	inheritanceEx18(){
		System.out.println("Child class Constructor...");
		
	}
    static{
    	System.out.println("Child class static block...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new inheritanceEx18();
		new inheritanceEx18();
	}

}
