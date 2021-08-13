package staticBlock;

public class staticBlock5 {
	
	static int empid;
	
	static {
		empid=1000;
	}
	
	static void disp() {
		System.out.println(empid);  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp();
	}

}
