package constructorEx;

public class parameterized {

	int id;
	String name;
	float salary;
	
	parameterized(int id, String name, float salary){
	   this.id = id;   // id=10
       this.name = name;
	   this.salary = salary;
//		
	System.out.println("Inside constructor = " + id+" "+name+" "+salary);
	}
	
	void disp() {
		System.out.println("Display Method = "+id+" "+name+" "+salary); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parameterized p1 = new parameterized(1,"aaa",100000.00f);
		parameterized p2 = new parameterized(2,"bbb",200000.00f);
		p1.disp();
		p2.disp();

	}

}
