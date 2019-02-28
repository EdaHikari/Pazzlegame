import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class PuzzleProject extends JFrame {
	
	public static void main(String[] args) {
		PuzzleProject mframe = new PuzzleProject("Puzzle_project");
		mframe.setVisible(true);	
	}
	
	
	PuzzleProject(String title){
		setTitle(title);
		setBounds(100,100,1000,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container content = getContentPane();	
		BacePanel mainpanel = new BacePanel();		
		content.add(mainpanel);
		
		ImageIcon icon = new ImageIcon("PuzzleIcon.png");
	    setIconImage(icon.getImage());
	    //pack();
	}

	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
	}
	
}
