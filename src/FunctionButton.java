import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;


public class FunctionButton extends JButton{

	public FunctionButton(String texit){
		setText(texit);
		setBackground(Color.WHITE);
		setFont(new Font("MS ÉSÉVÉbÉN",Font.BOLD,48));
		setFocusPainted(false);
	}
}
