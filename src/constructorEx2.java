package constructorEx;

public class constructorEx2 {
	
	void m1() {
		System.out.println("m1 Method");
	}
	
    constructorEx2(){
		System.out.println("0-arg Parameterized Constructor");
	}
	
	constructorEx2(int a){
		System.out.println("1-arg Parameterized Constructor = "+a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		constructorEx2 eEx2 = new constructorEx2();
		constructorEx2 eEx3 = new constructorEx2(a);
		
		eEx2.m1();
		eEx3.m1();

	}

}
