import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


public class BacePanel extends JPanel {

	public BacePanel(){
		setPreferredSize(new Dimension(1000,700));
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
	}
	
	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
	}
}
