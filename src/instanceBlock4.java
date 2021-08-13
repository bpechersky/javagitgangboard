package instanceblock;

public class instanceBlock4 {
	instanceBlock4(){
		System.out.println("0-arg constructor..."); 
	}
	instanceBlock4(int a){
		System.out.println("1-arg constructor...");
	}
	instanceBlock4(int a, int b){
		System.out.println("2-arg constructor...");
	}
	{
		System.out.println("Instance Block-1...");
	}
	{
		System.out.println("Instance Block-2...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new instanceBlock4();
         new instanceBlock4(10);
         new instanceBlock4(10,20);
         
	}

}
