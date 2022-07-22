package Java_Tutorial;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "ABCDEFGHIJKLMNOPQR\b\'ST\'UVWXYZ";
		System.out.println(txt.length());
		System.out.println(txt.indexOf('O'));
		System.out.println(txt.toLowerCase());
		String Upper=txt.toLowerCase();
		System.out.println(Upper.toUpperCase());
		System.out.println(Upper.concat(txt));
		/*for (type variableName : arrayName) {
			  // code block to be executed
		}*/
		
	}

}
