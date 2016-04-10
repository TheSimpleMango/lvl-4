import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VolCalc implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton cube = new JButton("cube");
	JButton rect = new JButton("rectangular prism");
	JButton hemi = new JButton("hemisphere");
	JButton cyli = new JButton("cylinder");

	VolCalc() {
		f.add(p);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		p.add(cube);
		p.add(rect);
		p.add(hemi);
		p.add(cyli);
		cube.addActionListener(this);
		rect.addActionListener(this);
		hemi.addActionListener(this);
		cyli.addActionListener(this);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(cube)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("side length: "));
			int a = x * x * x;
			System.out.println(String.format("%.3f", a));
		}
		if (e.getSource().equals(rect)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("side length: "));
			int a = x * x * x;
			System.out.println(String.format("%.3f", a));
		}
		if (e.getSource().equals(hemi)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("side length: "));
			int a = x * x * x;
			System.out.println(String.format("%.3f", a));
		}
		if (e.getSource().equals(cyli)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("side length: "));
			int a = x * x * x;
			System.out.println(String.format("%.3f", a));
		}
	}

	public static void main(String[] args) {
		VolCalc v = new VolCalc();
	}
}
