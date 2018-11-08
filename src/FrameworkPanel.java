import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;


public class FrameworkPanel extends JPanel {

	public FrameworkPanel() {
		setBackground(Color.YELLOW);
		setPreferredSize(new Dimension(800,700));
		setLayout(null);
	}
	
	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
	}
}
