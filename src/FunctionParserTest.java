import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionParserTest {
	//Look at the tests and write the class and method to make them pass. For an extra challenge, do not use the Java Math library. For an even greater challenge, write the method using recursion.

	@Test
	    public void test() {
	   	 FunctionParser functionParser = new FunctionParser();
	   	 Integer[] functionResults = new Integer[5];
	   	 
	   	 functionResults[0] = new Integer(4);
	   	 functionResults[1] = new Integer(1);
	   	 functionResults[2] = new Integer(0);
	   	 functionResults[3] = new Integer(1);
	   	 functionResults[4] = new Integer(4);
	   	 
	   	 assertArrayEquals(functionResults, functionParser.getFunctionResultsArray("x^2", -2, 2));
	    }

	    @Test
	    public void test2() {
	   	 FunctionParser functionParser = new FunctionParser();
	   	 Integer[] functionResults = new Integer[9];
	   	 
	   	 functionResults[0] = new Integer(-27);
	   	 functionResults[1] = new Integer(-8);
	   	 functionResults[2] = new Integer(-1);
	   	 functionResults[3] = new Integer(0);
	   	 functionResults[4] = new Integer(1);
	   	 functionResults[5] = new Integer(8);
	   	 functionResults[6] = new Integer(27);
	   	 functionResults[7] = new Integer(64);
	   	 functionResults[8] = new Integer(125);
	   	 
	   	 assertArrayEquals(functionResults, functionParser.getFunctionResultsArray("x^3", -3, 5));
	    }

	    @Test
	    public void test3() {
	   	 FunctionParser functionParser = new FunctionParser();
	   	 Integer[] functionResults = new Integer[21];
	   	 
	   	 functionResults[0] = new Integer(-100000);
	   	 functionResults[1] = new Integer(-59049);
	   	 functionResults[2] = new Integer(-32768);
	   	 functionResults[3] = new Integer(-16807);
	   	 functionResults[4] = new Integer(-7776);
	   	 functionResults[5] = new Integer(-3125);
	   	 functionResults[6] = new Integer(-1024);
	   	 functionResults[7] = new Integer(-243);
	   	 functionResults[8] = new Integer(-32);
	   	 functionResults[9] = new Integer(-1);
	   	 functionResults[10] = new Integer(0);
	   	 functionResults[11] = new Integer(1);
	   	 functionResults[12] = new Integer(32);
	   	 functionResults[13] = new Integer(243);
	   	 functionResults[14] = new Integer(1024);
	   	 functionResults[15] = new Integer(3125);
	   	 functionResults[16] = new Integer(7776);
	   	 functionResults[17] = new Integer(16807);
	   	 functionResults[18] = new Integer(32768);
	   	 functionResults[19] = new Integer(59049);
	   	 functionResults[20] = new Integer(100000);
	   	 
	   	 assertArrayEquals(functionResults, functionParser.getFunctionResultsArray("x^5", -10, 10));
	    }
}
