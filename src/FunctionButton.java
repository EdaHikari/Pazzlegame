import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;


public class FunctionButton extends  JButton implements MouseListener{
		
	String buttonname;
	String functype;
	
		public FunctionButton(String funcname){		
			 Border border = new BevelBorder(BevelBorder.RAISED, Color.gray, Color.black);
			setBorder(border);
			setBackground(Color.WHITE);
			setForeground(Color.BLACK);
			setText(funcname);
			setFont(new Font(Font.SANS_SERIF,Font.BOLD,48));
			setFocusable(false);
			addMouseListener(this);
			functype = funcname;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			BacePanel bpanel =(BacePanel)FunctionButton.this.getParent();
			
			if(functype == "START") bpanel.start();
			else if(functype == "RESET") bpanel.reset();			
		}

		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	
}
