// Every Object Creation Call Constructor
package constructorEx;

public class constructorCombined {
	
	int iVar = 10;
	static int sVar=20;
	
	constructorCombined(){
		int loVar = 30;
		
//		sVar =20;
		System.out.println("------------- Constructor Start---------------");
		System.out.println("Constructor loVar = "+loVar);
		System.out.println("Constructor InsVar = "+iVar);
		System.out.println("Constructor StVar = "+sVar);
		System.out.println("------------- Constructor End---------------");
//	iMet();
//	sMet();
	}
	
	void iMet() {
		int loVar = 300;
		
		System.out.println("------------- Instance ---------------");
		constructorCombined cc2 = new constructorCombined();
		
		System.out.println("Ins Meth loVar = "+loVar);
		System.out.println("Ins Meth InsVar = "+iVar);
		System.out.println("Ins Meth StVar = "+sVar); 
		
	}
	static void sMet() {
		int loVar = 3000;
		System.out.println("------------- Static ---------------");
		constructorCombined cc3 = new constructorCombined();
		System.out.println("Static Meth loVar = "+loVar);
		System.out.println("Static Meth InsVar = "+cc3.iVar); 
		System.out.println("Static Meth StVar = "+cc3.sVar);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorCombined cc1 = new constructorCombined();
		cc1.iMet();
		sMet();

	}

}
