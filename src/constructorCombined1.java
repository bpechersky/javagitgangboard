

public class constructorCombined1 {
	
	constructorCombined1(){
		System.out.println("------ constructor--------");
		insMeth();
		staMethod();
//		constructorCombined1 cc = new constructorCombined1();
	}
	
	void insMeth() {
		System.out.println("-------Instance Method---------");
//		new constructorCombined1();
	}
	
	static void staMethod() {
		System.out.println("------- Static Method---------");
//		 new constructorCombined1();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	constructorCombined1 cc1 = new constructorCombined1();
		staMethod();

	}

}
