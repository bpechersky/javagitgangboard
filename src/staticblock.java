package staticBlock;

public class staticblock {
	int i;
	static float j;
	
	static {
		int k=10;
		staticblock sb = new staticblock();
		System.out.println("Static Block");
		System.out.println(sb.i);
		System.out.println(j);
		System.out.println(k); 
		sb.add();
		subtr();
	}
	{
		System.out.println("Instance Block");
		add();
	}
	staticblock(){
		System.out.println("Constructor");   
	}
	void add() {
		System.out.println("instance method");
	}
	
	static void subtr() {
		System.out.println("static method");  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new staticblock();

	}
}
