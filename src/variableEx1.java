public class variableEx1 {
	
	int j = 20;
	static int k = 30;


	public static void main(String[] aaaaaa) {
		// TODO Auto-generated method stub
		
//		final int i = 10;
		int i = 10;
		System.out.println("WELCOME");
		i = i+100;
		System.out.println(i); 
		System.out.println("LOCAL VARIABLE = "+i);  
		
		variableEx1 vEx1 = new variableEx1();
		System.out.println("Instance Variable = "+vEx1.j);  
		
		System.out.println("STATIC VARIABLE DIRECT = "+k);
		System.out.println("STATIC VARIABLE OBJECT = "+vEx1.k);
		System.out.println("STATIC VARIABLE CLASS NAME = "+variableEx1.k);

	}
	
	
}
