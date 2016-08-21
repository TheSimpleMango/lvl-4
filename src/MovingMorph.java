import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends RedMorph {

	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}

	@Override
	public void update() {
		super.update();
		Random r = new Random();
		super.setX(super.getX() + r.nextInt(4) - r.nextInt(3));
		super.setY(super.getY() + r.nextInt(4) - r.nextInt(3));
	}

}
