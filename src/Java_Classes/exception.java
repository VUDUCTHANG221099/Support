package Java_Classes;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//throw new  
		try {
			int []a= {1,2,3};
			System.out.println(a[50]);
		} catch (Exception e) {

			System.out.println("Exception");
			// TODO: handle exception
		}finally {
			System.out.println("finally");
		}
	}

}
