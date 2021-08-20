// variable name is same it gets ambiguity

interface ab{
	int a = 100;
}
interface bc{
	int a = 200;
}

public class interfaceEx7 implements ab,bc{

	public void m1(){
		System.out.println(ab.a);
		System.out.println(bc.a);
//		System.out.println(a);  // ambiguity
//		System.out.println(a); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new interfaceEx7().m1();
	}

}

