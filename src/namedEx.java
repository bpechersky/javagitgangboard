
package constructorEx;

public class namedEx {
	
	namedEx(){
		System.out.println("0 arg constructor");
	}
	namedEx(int a){
		System.out.println("1 arg constructor");		
	}
	namedEx(int a,int b){
		System.out.println("2 arg constructor ");
	}
	void m1() {
		System.out.println("M1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Named Approach
		
		namedEx Ex1 = new namedEx();
		namedEx Ex2 = new namedEx(10);
		namedEx Ex3 = new namedEx(10, 20);
		
		Ex1.m1();
		
		//Nameless Approach
		new namedEx();
		new namedEx(10);
		new namedEx(10, 20);
		
		new namedEx().m1();
//		new m1();
	}

}
