package instanceblock;

public class instanceBlock5 {
	
	instanceBlock5(){		
		this(10);
		System.out.println("0-arg constructor...");	
	}
	
	instanceBlock5(int a){ 
		System.out.println("1-arg constructor...");
		
	}
	{
		System.out.println("Instance Block...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new instanceBlock5();

	}

}
