
public class test {
	public static void main(String[] args) {
		String m = "Formed mostly as the result of volcanic eruptions, Java is the 13th largest island in the world and the fifth largest in Indonesia. A chain of volcanic mountains forms an east–west spine along the island. Three main languages are spoken on the island, with Javanese being the dominant; it is the native language of about 60 million people in Indonesia, most of whom live on Java. Most residents are bilingual, with Indonesian as their first or second language. While the majority of the people of Java are Muslim, Java has a diverse mixture of religious beliefs, ethnicities, and cultures.";
		String[] x = sortWords(m);
		for (String string : x) {
			System.out.println(string);
		}
	}

	public static String[] sortWords(String y) {
		boolean isSorted = false;
		String p = "";
		String x[] = y.split(" ");
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i].compareTo(x[i + 1]) > 0) {
					isSorted = false;
					p = x[i + 1];
					x[i + 1] = x[i];
					x[i] = p;
				}
			}
		}
		return x;
	}
}
