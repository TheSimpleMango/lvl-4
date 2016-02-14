import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class GithubLove {
	public static void main(String[] args) {
		int a = 1;
		String[] usernames = {"C", "B", "D", "E", "A", "F"};
		//String[] usernames = {"lauren-chan", "joelforeman", "techied", "thesimplemango", "buskcoin", "yuz217"};
		while (a != 0){
			a = 0;
			for (int i = 0; i < usernames.length - 1; i++) {
				if(usernames[i].compareToIgnoreCase(usernames[i+1]) > 0){
					String x = usernames[i];
					usernames[i] = usernames[i+1];
					usernames[i+1] = x;
					a++;
					}
			}
		}
		for (int i = 0; i < usernames.length; i++) {
			System.out.println(usernames[i]);
		}
		Random x = new Random();
		JOptionPane.showMessageDialog(null, "<3: " + usernames[x.nextInt(5)]);
	}
}