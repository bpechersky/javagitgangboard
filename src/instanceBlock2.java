package instanceblock;

public class instanceBlock2 {
		
	instanceBlock2(){
		System.out.println("0-arg Constructor");
	}
	instanceBlock2(int a){
		System.out.println("1-arg Constructor");
	}
	instanceBlock2(int a, int b){
		System.out.println("2-arg Constructor");
	}
	
	{
		System.out.println("Instance Block...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new instanceBlock2();
		new instanceBlock2(10);
		new instanceBlock2(10,20);
		

	}

}
