package staticBlock;

public class staticBlock1 {
	
	{
		System.out.println("Instance Block-1...");
	}
	{
		System.out.println("Instance Block-2...");
	}
	static {
		System.out.println("Static Block-1...");
	}
	static {
		System.out.println("Static Block-2...");
	}
	
	staticBlock1(){
		System.out.println("0-arg constructor...");
	}
	
	staticBlock1(int a){
		System.out.println("1-arg constructor...");
	}
    static {	
		System.out.println("Static Block-3...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome");
	
		new staticBlock1();
		new staticBlock1(10);

	}

}
