import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	int x;

	Polymorph p;
	Polymorph mo;
	Polymorph c;
	Polymorph cl;
	RedMorph r;
	MovingMorph m;

	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		p = new Polymorph(50, 100);
		c = new Polymorph(250, 100);
		cl = new Polymorph(250, 250);
		r = new RedMorph(100, 50);
		m = new MovingMorph(100, 100);
		mo = new Polymorph(150, 150);

		polymorphs.add(p);
		polymorphs.add(mo);
		polymorphs.add(c);
		polymorphs.add(cl);
		polymorphs.add(r);
		polymorphs.add(m);

		timer = new Timer(1000 / 500, this);
		timer.start();
		window.addMouseMotionListener(this);
		window.addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		for (Polymorph polymorph : polymorphs) {
			polymorph.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph polymorph : polymorphs) {
			polymorph.update();
		}
		c.setX(250 + (int) Math.floor((Math.cos(Math.toRadians(x)) * 100)));
		c.setY(100 + (int) Math.floor((Math.sin(Math.toRadians(x)) * 100)));
		x++;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mo.setX(e.getX() - 10);
		mo.setY(e.getY() - 35);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource().equals(cl)) {
			JOptionPane.showMessageDialog(null, "hi");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}