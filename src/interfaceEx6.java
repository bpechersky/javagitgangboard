interface a5{   // abstract
	int a=10;   // public static final
	void m1();  // public abstract
}

public class interfaceEx6  implements a5{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new interfaceEx6().m1();
	} 

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		a=a+10;
		System.out.println("M1 Method..."+a);
	}

}
