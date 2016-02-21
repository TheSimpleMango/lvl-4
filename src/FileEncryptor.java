package file_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileEncryptor {
	public static File openSecretFile(){
		return new File("text");
	}
	public static String readOneLine(File f) throws FileNotFoundException{
		Scanner s = new Scanner(f);
		return s.nextLine();
	}
	public static String readFileContents(File f) throws FileNotFoundException{
		Scanner s = new Scanner(f);
		String x = "";
		while (s.hasNextLine()) {
			x+=s.nextLine();
		}
		return x;
	}
	public static String encrypt(String x){
		String y = "";
		char z = ' ';
		for (char c : x.toCharArray()) {
			z = (char) (c + 2);
			y += z;
		}
		return y;
	}
	public static String decrypt(String x){
		String y = "";
		char z = ' ';
		for (char c : x.toCharArray()) {
			z = (char) (c - 2);
			y += z;
		}
		return y;
	}
	public static File saveFile(String string) throws IOException {
		File f = new File(string);
		FileWriter fr = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fr);
		b.close();
		return f;
	}
	public static void saveStuffInAFile(String s, File f) throws IOException{
		FileWriter fr = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fr);
		b.write(s);
		b.close();
	}
}
