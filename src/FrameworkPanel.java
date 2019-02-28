import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLayeredPane;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


public class FrameworkPanel extends JLayeredPane {

	public FrameworkPanel() {
		setBounds(200,100,600,600);
		Border border = new EtchedBorder(EtchedBorder.RAISED, Color.black, Color.black);
		setBorder(border);
		setBackground(Color.WHITE);
		setLayout(null);
		setLayer(this,0);
		setOpaque(true);
	}
	
	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
		
		Address adr = new Address();
		for(int i = 0;i<9;i++){
			graphics.drawRect(adr.start_x[i]*200, adr.start_y[i]*200, 200, 200);
		}
	}
}
