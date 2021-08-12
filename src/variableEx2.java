public class variableEx2 {
	
	int i = 10;
	static int j;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		variableEx2 vEx2 = new variableEx2();
		System.out.println("Instance Variable = "+vEx2.i); 
		System.out.println("Static Variable = "+vEx2.j);
		
		vEx2.i = 100;
		vEx2.j = 200;
		System.out.println("Instance Variable = "+vEx2.i); 
		System.out.println("Static Variable = "+vEx2.j);
		
		variableEx2 vEx21 = new variableEx2();
		System.out.println("Instance Variable = "+vEx21.i); 
		System.out.println("Static Variable = "+vEx21.j);

	}

}
