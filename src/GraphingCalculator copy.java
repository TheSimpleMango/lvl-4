import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.*;

import javax.swing.*;

public class GraphingCalculator extends JPanel implements MouseListener{
	JFrame f = new JFrame("ayyy");
	Integer[] functionResult;
	public GraphingCalculator() {
		f.add(this);
		f.setSize(501, 501);
		f.setVisible(true);
		f.addMouseListener(this);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		FunctionParser fp = new FunctionParser();
		functionResult = fp.getFunctionResultsArray("x^2", -1 * f.getWidth()/2, f.getWidth()/2);
	}
	public static void main(String[] args) {
		GraphingCalculator w = new GraphingCalculator();
	}
	public void paintComponent(Graphics g){
		g.drawLine(f.getHeight()/2, 0, f.getHeight()/2, f.getWidth());
		g.drawLine(0, f.getWidth()/2, f.getHeight(), f.getWidth()/2);
		int ctr = 0;
		for (int i = -1 * f.getWidth() / 2; i < f.getWidth() / 2; i++) {
			g.fillRect(i, functionResult[ctr++], 2, 2);
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("x: " + (e.getX() - f.getWidth()/2) + "; y: " + (f.getHeight()/2 - e.getY()));
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
