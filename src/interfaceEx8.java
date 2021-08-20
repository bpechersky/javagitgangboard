public class interfaceEx8 implements Cloneable{
	
	int a = 100;
	int b = 200;
	
	void add() {
		System.out.println("aaaa");  
	}

	public static void main(String[] args) throws CloneNotSupportedException   {   
		// TODO Auto-generated method stub
  
		interfaceEx8 iEx8 = new interfaceEx8();
		
		System.out.println(iEx8.a);
		System.out.println(iEx8.b); 
		
		iEx8.a = 10;
		iEx8.b = 20;
		
		System.out.println(iEx8.a);
		System.out.println(iEx8.b); 
		
		
//		interfaceEx8 iEx82 = new interfaceEx8();
		interfaceEx8 iEx81  =  (interfaceEx8) iEx8.clone(); 
//		interfaceEx8 iEx81 ;
//		iEx81=iEx8; 
		 
//		iEx81.a = 1;
//		iEx81.b = 2;
		
		System.out.println(iEx81.a);
		System.out.println(iEx81.b); 
		iEx81.add();
		
		
		
	}

}
