import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph {
	RedMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
}
