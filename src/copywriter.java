import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class copywriter {
	public copywriter() {
		String directory;
		try {
			directory = new File("src").getCanonicalPath();
			File file = new File(directory);
			for (File f : file.listFiles()) {
				FileWriter fw = new FileWriter(f, true);
				fw.append("// ayyyy lmao");
				fw.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		copywriter cw = new copywriter();
	}
}