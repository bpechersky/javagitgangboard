package inheritance;

class AA {
	void method1(){
		System.out.println("classs A - method1");
	}
    void method2(){
    	System.out.println("classs A - method2");
	}
}

class BB extends AA{
	
    void method3(){
    	System.out.println("classs B - method3");
	}
    void method4(){
    	System.out.println("classs B - method4");
	}
	
}
class CC extends BB{
		
    void method5(){
	System.out.println("classs C - method5");
	}
    void method6(){
    	System.out.println("classs C - method6");
	}
}


public class inheritanceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA A1 = new AA();
		BB B1 = new BB();
		CC C1 = new CC();
		
		A1.method1();
		A1.method2();
		
		B1.method1();
		B1.method2();
		B1.method3();
		B1.method4();
		
		C1.method1();
		C1.method2();
		C1.method3();
		C1.method4();
		C1.method5();
		C1.method6();

	}

}
