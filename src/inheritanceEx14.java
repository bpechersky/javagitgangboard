package inheritance;
class parentiinstance{
	{
		System.out.println("Parent class instance block...");
	}
}

public class inheritanceEx14 extends parentiinstance{
	{
		System.out.println("Child class instance block...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new inheritanceEx14();
	}

}
