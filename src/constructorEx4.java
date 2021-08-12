


public class constructorEx4 {
	int empid;
	String name;
	float salary;
	
	void disp() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary); 
	}
	
     constructorEx4(){
		empid = 1;
		name = "aaa";
		salary = 100000f;		
      }
     
//     constructorEx4(constructorEx4 c){ 
// 		c.empid = 2;
// 		c.name = "bbb";
// 		c.salary = 200000f;		
//       }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorEx4 cEx4 = new constructorEx4();
//		cEx4.disp();
//		constructorEx4 cEx41 = new constructorEx4(cEx4);
		cEx4.disp();
	}

}
