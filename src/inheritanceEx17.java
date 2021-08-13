package inheritance;
class parentinheritance3{
	{
		System.out.println("Parent class instance block...");
	}
	parentinheritance3(){
		System.out.println("Parent class Constructor...");
	}
}

public class inheritanceEx17 extends parentinheritance3{

	{
		System.out.println("Child class instance block...");
	}
	inheritanceEx17(){
		System.out.println("Child class Constructor...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new inheritanceEx17();
		new inheritanceEx17();
	}

}
