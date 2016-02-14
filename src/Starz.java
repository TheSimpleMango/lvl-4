import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class Starz {

	public static void main(String[] args) {
		Tortoise x = new Tortoise();
		x.show();
		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
		x.setX(0);
		x.setAngle(90);
		x.setSpeed(8);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 5; j++) {
				x.move(30);
				x.turn(144);
			}
			x.move(30);
		}
		// 3. Set the size of the star to 30.
		
		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}


