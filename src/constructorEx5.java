package constructorEx;

public class constructorEx5 {
	int a;
	String name;
	float salary;
	
	constructorEx5(){
		a = 100;
		name = "bbb";
		salary = 100000f;
	}
	
	
	void disp(){
		System.out.println(a);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorEx5 cEx5 = new constructorEx5();
		cEx5.disp();
		
		constructorEx5 cEx51 = new constructorEx5();
		cEx51.disp();
	}

}
