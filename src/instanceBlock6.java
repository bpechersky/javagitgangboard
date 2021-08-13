package instanceblock;

public class instanceBlock6 {
	int empid;
	static int salary;
	
	
	{
		empid=100;
		salary = 1000;
	}
	
	void disp(){
		System.out.println(empid); 
		System.out.println(salary); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		instanceBlock6 ib6 = new instanceBlock6();
		ib6.disp();
	}

}
