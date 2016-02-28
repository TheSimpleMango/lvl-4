
public class codingbat {
	public static void main(String[] args) {
		System.out.println(doubleChar("The"));
	}
	public static String doubleChar(String s){
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r+= s.charAt(i) + "" + s.charAt(i);
		}
		return r;
	}
}
