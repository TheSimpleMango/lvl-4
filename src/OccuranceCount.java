
public class OccuranceCount {
	public static void main(String[] args) {
		String s = "yabadabado";
		String test = "ba";
		System.out.println(getOccurances(s, test));
	}

	private static int getOccurances(String s, String test) {
		int o = 0;
		String[] splitS = s.split(test);
		o = splitS.length - 1;
		return o;
	}
}
