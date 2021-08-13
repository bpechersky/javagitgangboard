package inheritance;

class parent{
	int a=10;
	int b=20;
	
}

public class inheritanceEx4 extends parent{
	int x = 100;
	int y = 200;
	
	void add(int i, int j) {
		System.out.println(i+j); // local
		System.out.println(a+b); // parent
		System.out.println(x+y); // child
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		new inheritanceEx4().add(1000, 2000);
		
		inheritanceEx4 iEx4 = new inheritanceEx4();
		iEx4.add(1000, 2000);
		
	}

}
