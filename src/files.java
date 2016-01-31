import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class files {
	public static void main(String[] args) {
		File f = new File("test.txt");
		String s = "filessssssss";
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			bw.write(s);
			String r = br.readLine();
			while(!r.equals(null)){
				br.readLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}// ayyyy lmao