package constructorEx;

public class constructorEx3 {
	
	constructorEx3(){
		System.out.println("0-arg Parameterized Cons");
	}
	
	constructorEx3(int a){
		System.out.println("1-arg Parameterized Cons = "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		constructorEx3 cEx1 = new constructorEx3();
		constructorEx3 cEx2 = new constructorEx3(10);		
	}
}
