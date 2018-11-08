import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuListener;


public class PuzzlePanel extends JPanel implements MouseMotionListener{
	
	BufferedImage buffImg = null;
	int width,height,start_x,start_y,bounds_x,bounds_y;
		  
	public PuzzlePanel(Dimension size,Dimension start){
		setPreferredSize(size);
		setBackground(Color.BLUE);
	    Border border = new BevelBorder(BevelBorder.RAISED, Color.white, Color.black);
		setBorder(border);
		width = (int)(size.getWidth());
		height = (int)(size.getHeight());
		start_x= (int)(start.getWidth());
		start_y = (int)(start.getHeight());
		setBounds(start_x,start_y,width,height);
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
		setBounds(event.getXOnScreen()-200,event.getYOnScreen()-200,width,height);
		repaint();		
	}

	@Override
	public void mouseMoved(MouseEvent event) {	}

}
