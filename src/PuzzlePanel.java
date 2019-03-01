import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;


public class PuzzlePanel extends JLayeredPane implements MouseMotionListener{
	
	BufferedImage buffImg = null;
	int width,height,start_x,start_y;
	public boolean lock = false;
		  
	public PuzzlePanel(Dimension size,Dimension start){
		setPreferredSize(size);
		setBackground(Color.BLUE);
	    Border border = new BevelBorder(BevelBorder.RAISED, Color.white, Color.black);
		setBorder(border);
		width = (int)(size.getWidth());
		height = (int)(size.getHeight());
		start_x= (int)(start.getWidth());
		start_y = (int)(start.getHeight());
		setLayer(this,1);
		addMouseMotionListener(this);
	
		try{
			buffImg = ImageIO.read(new File("puzzle1.jpg"));
		}catch(IOException ex){
			ex.getMessage();
		}
	}
	
	@Override
	public void paintComponent(Graphics graphics){
		graphics.drawImage(buffImg, 0, 0,width,height,start_x,start_y,start_x + width,start_y + height, null);
	}

	@Override
	public void mouseDragged(MouseEvent event) {
		
		setBounds(event.getXOnScreen()-width,event.getYOnScreen()-width,width,height);		
		
		if((start_x)<(event.getXOnScreen()) &&(event.getXOnScreen())<(start_x+width)
				&& (start_y)<( event.getYOnScreen()) &&( event.getYOnScreen()) < (start_y+height)){
			
			removeMouseMotionListener(this);
			setBounds(start_x,start_y,width,height);
			lock = true;
			
			BacePanel bpanel =(BacePanel)PuzzlePanel.this.getParent();
			bpanel.piececheck();
		}
	}

	@Override
	public void mouseMoved(MouseEvent event) {	}

}
