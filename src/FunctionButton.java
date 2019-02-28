import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;


public class FunctionButton extends  JButton implements MouseListener{
		
	String functype;
	
		public FunctionButton(String texit){		
			 Border border = new BevelBorder(BevelBorder.RAISED, Color.gray, Color.black);
			setBorder(border);
			setBackground(Color.WHITE);
			setForeground(Color.BLACK);
			setText(texit);
			setFont(new Font("MS �S�V�b�N",Font.BOLD,48));
			setFocusable(false);
			addMouseListener(this);
			functype = texit;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			BacePanel bpanel =(BacePanel)FunctionButton.this.getParent();
			
			if(functype == "START") bpanel.start();
			else if(functype == "RESET") bpanel.reset();
			else if(functype == "PIECE_9") bpanel.prerare(9);
			else if(functype == "PIECE_16") bpanel.prerare(16);
			else if(functype == "PIECE_25") bpanel.prerare(25);
			else if(functype == "PIECE_36") bpanel.prerare(36);				
			
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
