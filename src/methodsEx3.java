//package morning8am;

public class methodsEx3 {
	
	int i = 10;
	
	void add(int i) {
		System.out.println("Instance Variable = "+this.i);  
		System.out.println("Local Variable = "+i); 
	}
	
	static void add1(int i) {
//		System.out.println("Instance Variable = "+this.i);  
		methodsEx3 mEx31 = new methodsEx3();
		System.out.println("Instance Variable = "+mEx31.i); 
		
		System.out.println("Local Variable = "+i); 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodsEx3 mEx3 = new methodsEx3();
		mEx3.add(100);
		add1(1000);
	
		
	}

}
