import static org.junit.Assert.*;

import org.junit.Test;

public class FindRepeatTest {
	@Test
	public void test(){
	String[] list = {"dog", "cat", "dog", "bird", "bird", "tiger"};
	showRepeating(list);
	assertEquals(true, findValue("dog", list));
	assertEquals(false, findValue("dolphin", list));
	}
	public void showRepeating(String[] list){
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i].equals(list[j])) {
					System.out.println(list[i]);
				}
			}
		}
	}
	public boolean findValue(String value, String[]list){
		for (int i = 0; i < list.length; i++) {
			if (value.equals(list[i])) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}
}
