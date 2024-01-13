package experiment;
public class my_3_2 {

	public static void main(String[] args) {
		String s="Call me Ishmael.";
		System.out.println(s);
		System.out.println("s.length() = " + s.length());
		System.out.println("s.charAt(0) = " + s.charAt(0));
		System.out.println("s.charAt(s.length()-1) = " + s.charAt(s.length()-1));
		System.out.println("s.substring(s.indexOf(\"Call\"),s.indexOf(\"Call\")+4) = " + s.substring(s.indexOf("Call"),s.indexOf("Call")+4));
	}

}
