package instanceblock;

public class instanceblock7 {
	
	int i =10;
	static int j = 20;
	
	{
	System.out.println("Instance Block");
	int k = 30;
	System.out.println("Local = "+k);
	System.out.println("Instance = "+i); 
	System.out.println("Static = "+j); 
	insMet();
	staMet();
	}
	instanceblock7(){
		System.out.println("constructor");   
	}
	
	void insMet() {
		System.out.println("Instance");
	}
	
	static void staMet() {
		System.out.println("Static");  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new instanceblock7();
	}

}
