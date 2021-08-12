package constructorEx;

public class constructorCallingEx1 {

	constructorCallingEx1(){

		System.out.println("0-arg constructor");
	//	this(10);
		
	}
	constructorCallingEx1(int a){

		System.out.println("1-arg constructor");
	//	this(10,20);
		
	}
	constructorCallingEx1(int a,int b){
		System.out.println("2-arg consructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorCallingEx1 cEx1 = new constructorCallingEx1();
	}

}
