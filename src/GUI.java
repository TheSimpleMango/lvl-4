import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	int aLength = 0;
	int[] x = new int[0];
	int[] y;
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton submit = new JButton("submit");
	
	public GUI() {
		f.add(p);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(submit);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		submit.addActionListener(this);
		f.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b0)) {
			y = x;
			x = new int[aLength+1];
			for (int i = 0; i < y.length; i++) {
				x[i] = y[i];
			}
			x[aLength] = 0;
			aLength++;
		}
		if (e.getSource().equals(b1)) {
			y = x;
			x = new int[aLength+1];
			for (int i = 0; i < y.length; i++) {
				x[i] = y[i];
			}
			x[aLength] = 1;
			aLength++;
		}
		if (e.getSource().equals(b2)) {
			y = x;
			x = new int[aLength+1];
			for (int i = 0; i < y.length; i++) {
				x[i] = y[i];
			}
			x[aLength] = 2;
			aLength++;
		}
		if (e.getSource().equals(submit)) {
			String z = "";
			for (int i = 0; i < aLength; i++) {
				z += (x[i] + " ");
			}
			JOptionPane.showMessageDialog(null, z);
			z = "";
			x = new int[0];
			aLength = 0;
		}
	}
	public static void main(String[] args) {
		GUI g = new GUI();
	}
}
