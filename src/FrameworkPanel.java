import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLayeredPane;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


public class FrameworkPanel extends JLayeredPane {

	int piecenumber;
	public FrameworkPanel(int piecenumber) {
		this.piecenumber = piecenumber;
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
		for(int i = 0;i<piecenumber;i++){
			for(int j = 0;j<piecenumber;j++){
				graphics.drawRect(i*(600/piecenumber), j*(600/piecenumber), 600/piecenumber, 600/piecenumber);
			}
		}
	}
}
