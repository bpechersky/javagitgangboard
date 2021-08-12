public class methodsEx2 {
	
	void add1() {
		System.out.println("Without Argument Without Return Value");  		
	}
	
	void add2(int a) { 
		System.out.println("With Argument Without Return Value = "+a); 
	}
	
	 String add3() {
		System.out.println("Without Argument With Return Value");
		return "WELCOME"; 
	}
	 
	 int add4(int x, int y) {
		int z = x+y;
		System.out.println("With Argument With Return Value");
		return z;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME");
		
		
		methodsEx2 mEx2 = new methodsEx2();
		mEx2.add1();
		mEx2.add2(10);
		String b = mEx2.add3();
		System.out.println("B Value  = "+b); 
		int c = mEx2.add4(1000,2000);
		System.out.println("C Value = "+c); 
		
		

	}

}
