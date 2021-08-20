public class encapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		empBean eb1 = new empBean();
		
		eb1.setEmpid(111);
		eb1.setEmpname("aaa"); 
//		eb1.setEmpid(111);
//		eb1.setEmpname("aaa");
		System.out.println(eb1.getEmpid());
		System.out.println(eb1.getEmpname()); 
		
		empBean eb2 = new empBean();
		eb2.setEmpid(222);
		eb2.setEmpname("bbb");
		System.out.println(eb2.getEmpid());
		System.out.println(eb2.getEmpname()); 

	}

}
	