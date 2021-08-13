package inheritance;

class A {
//	static {
//		System.out.println("Class- A");
//	}
	void method1(){
		System.out.println("classs A - method1");
	}
    void method2(){
    	System.out.println("classs A - method2");
	}
}

class B{
//	static {
//		System.out.println("Class- B");
//	}
	void method1(){
		System.out.println("classs B - method1");
	}
    void method2(){
    	System.out.println("classs B - method2");
	}
    void method3(){
    	System.out.println("classs B - method3");
	}
    void method4(){
    	System.out.println("classs B - method4");
	}
	
}
class C{
//	static {
//		System.out.println("Class- C");
//	}
	void method1(){
		System.out.println("classs C - method1");
	}
    void method2(){
    	System.out.println("classs C - method2");
	}
    void method3(){
    	System.out.println("classs C - method3");
	}
    void method4(){
    	System.out.println("classs C - method4");
	}
    void method5(){
	System.out.println("classs C - method5");
	}
    void method6(){
    	System.out.println("classs C - method6");
	}
}

public class inheritanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 A a = new A();
		 B b = new B();
		 C c = new C();
		 
		 a.method1();
		 a.method2();
		 
		 b.method1();
		 b.method2();
		 b.method3();
		 b.method4();
		 
		 c.method1();
		 c.method2();
		 c.method3();
		 c.method4();
		 c.method5();
		 c.method6();

	}

}
