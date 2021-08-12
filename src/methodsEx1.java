public class methodsEx1 {
	
	int b = 30; 
	static int c = 40;
	
	
	void add() {
		int a = 10;
		System.out.println("Instance Method");  
		System.out.println("Instance Method Local Variable = "+a);
		
		System.out.println("Instance Method Instance Variable = "+b); 
		
		methodsEx1 mEx3 = new methodsEx1();
		System.out.println("Instance Method Static Variable Direct = "+c);
		System.out.println("Instance Method Static Variable Object = "+mEx3.c);
		System.out.println("Instance Method Static Variable Class Name = "+methodsEx1.c);
	}
	
	static void multiply() {
		int a = 20;
		System.out.println("Static Method  Local Variable = "+a);  
		
		methodsEx1 mEx2 = new methodsEx1();
		System.out.println("Static Method Instance Variable = "+mEx2.b);
		
		System.out.println("Static Method Static Variable Direct = "+c);
		System.out.println("Static Method Static Variable Object = "+mEx2.c);
		System.out.println("Static Method Static Variable Class Name = "+methodsEx1.c);
	}
	
	
	

	public static void main(String[] args) {  // JVM
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME");
		
		methodsEx1 mEx1 = new methodsEx1();
		mEx1.add(); 
		
		multiply();
		mEx1.multiply();
		methodsEx1.multiply();

	}

}
