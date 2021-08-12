

public class constructorCalling {
	
	constructorCalling(){
		this(10);
		System.out.println("0-arg constructor");
	}
	
	constructorCalling(int a){
		this(10,20);
	System.out.println("1-arg constructor");	
	}
		
	constructorCalling(int a,int b){
//		this();
		System.out.println("2-arg consructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorCalling cEx = new constructorCalling();
//		constructorCalling cEx1 = new constructorCalling(10);
//		constructorCalling cEx2 = new constructorCalling(100, 200);
		

	}

}
