package staticBlock;

public class staticBlock2 {
	{
		System.out.println("Instance Block1...");
	}
	{
		System.out.println("Instance Block2...");
	}
	static {
		System.out.println("Static Block1...");
	}
	static {
		System.out.println("Static Block2...");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticBlock2 s2 = new staticBlock2();

	}

}
