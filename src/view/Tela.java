package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Tela extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		this.setBackground(Color.CYAN);
		
		g2d.setColor(Color.MAGENTA);
		g2d.setStroke(new BasicStroke(10));
		g2d.drawLine(10, 10, 120, 220);
		g2d.drawLine(50, 10, 160, 220);
		g2d.drawLine(10, 10, 50, 10);
		g2d.drawLine(120, 220, 160, 220);
		
		//g2d.drawLine(x1, y1, x2, y2);
		
	}
	

}
