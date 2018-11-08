import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame implements MouseListener{
	
	FrameworkPanel centerpanel = new FrameworkPanel();
	BacePanel mainpanel = new BacePanel();
	PuzzlePanel piece[] = new PuzzlePanel[9];
	
	MainFrame(String title){
		setTitle(title);
		setBounds(100,100,700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container content = getContentPane();

		FunctionButton startbutton = new FunctionButton("START");
		startbutton.addMouseListener(this);
		mainpanel.add(startbutton,BorderLayout.NORTH);
		
		Address adr = new Address();
		
		for(int i = 0;i<9;i++){
			piece[i] = new PuzzlePanel(new Dimension(200,200),new Dimension(adr.x[i]*200,adr.y[i]*200));
			piece[i].setBounds(adr.x[i]*200+200, adr.y[i]*200, 200, 200);
			mainpanel.add(piece[i]);
		}
		mainpanel.add(centerpanel,BorderLayout.CENTER);
		content.add(mainpanel);
		
		ImageIcon icon = new ImageIcon("PuzzleIcon.png");
	    setIconImage(icon.getImage());
	    pack();
	}

	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		
		Address adr = new Address();
		adr.rondomAddress();
		
		for(int i = 0;i<9;i++){
			piece[i].setBounds(adr.x[i]*200+200, adr.y[i]*200, 200, 200);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {	}

	@Override
	public void mouseExited(MouseEvent arg0) {	}

	@Override
	public void mousePressed(MouseEvent arg0) {	}

	@Override
	public void mouseReleased(MouseEvent arg0) {	}

}	
			