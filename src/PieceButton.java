import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class PieceButton extends  JButton implements MouseListener{
	
	int functype;
	String buttonname;
	
	public PieceButton(int piecenmeber){		
		 Border border = new BevelBorder(BevelBorder.RAISED, Color.gray, Color.black);
		setBorder(border);
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		buttonname = "PIECE_"+ Integer.toString(piecenmeber)+"Å~"+Integer.toString(piecenmeber);
		setText(buttonname);
		setFont(new Font(Font.SANS_SERIF,Font.BOLD,48));
		setFocusable(false);
		addMouseListener(this);
		functype = piecenmeber;
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		BacePanel bpanel =(BacePanel)PieceButton.this.getParent();
		if(functype == 3) bpanel.prerare(3);
		else if(functype == 4) bpanel.prerare(4);
		else if(functype == 5) bpanel.prerare(5);
		else if(functype == 6) bpanel.prerare(6);			
	}

	@Override
	public void mouseEntered(MouseEvent e) {		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
