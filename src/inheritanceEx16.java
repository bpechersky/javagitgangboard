package inheritance;
class parentinheritance2{
	{
		System.out.println("Parent class instance block...");
	}
	static{
		System.out.println("Parent class static block...");
	}
	parentinheritance2(){
		this(10);	
		System.out.println("Parent class 0-arg Constructor...");	
	}
	parentinheritance2(int a){
		System.out.println("Parent class 1-arg Constructor...");	
	}
}

public class inheritanceEx16 extends parentinheritance2{
	{
		System.out.println("Child class instance block...");
	}
	static{
		System.out.println("Child class static block...");
	}
	inheritanceEx16(){
		// super()
		System.out.println("Child class 0-arg Constructor...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new inheritanceEx16();
		new inheritanceEx16();
	}

}
