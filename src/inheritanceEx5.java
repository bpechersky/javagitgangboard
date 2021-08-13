package inheritance;
//super class variables
class parent1{
	static int c=1;
	int a=1000;
	int b=2000;
}

public class inheritanceEx5 extends parent1{
	int a =100;
	int b =200;
	static int c=2;
	
	
	void add(int a,int b) {
//		inheritanceEx5 v5 = new inheritanceEx5();
		System.out.println(a+b); // 10+20
		System.out.println(this.a+this.b);  // 100+200
		System.out.println(super.a+super.b);  // 1000+2000
		System.out.println(this.c);
		System.out.println(super.c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		  new inheritanceEx5().add(10, 20);
		 
		 
	}

}
