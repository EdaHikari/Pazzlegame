import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class BacePanel extends JLayeredPane {
	
	PuzzlePanel piece[] = new PuzzlePanel[9];
	enum funcvarie {START,RESET}
	Address adr;
	int piecenumber;

	public BacePanel(){
		setPreferredSize(new Dimension(1000,700));
		setLayer(this,0);
		setOpaque(true);
		entrance();
	}
	
	public void entrance(){
		setBackground(new Color(50,128,128));
		
		JLabel welcome = new JLabel();
		welcome.setText("<html><center>!!!PuzzleGame!!!<br>下の中から好きなピース数を選んでね</center></html>");
		welcome.setBounds(150,0,800,200);
		welcome.setFont(new Font("MS �S�V�b�N",Font.BOLD,40));
		add(welcome);
		
		FunctionButton funcbutton[] = new FunctionButton[4];
		for(int i = 0;i<4;i++){
			String number = "PIECE_"+ Integer.toString((i+3)*(i+3));
			funcbutton[i] = new FunctionButton("PIECE_9");
			funcbutton[i].setBounds(300,i*100+200,400,100);
			add(funcbutton[i]);
		}	
		repaint();
	}
	
	public void prerare(int piecenumber){
		System.out.println("prepare");
		this.piecenumber = piecenumber;
		removeAll();
		setLayout(null);
		setBackground(Color.YELLOW);
		
		FrameworkPanel centerpanel = new FrameworkPanel();
		
		FunctionButton funcbutton = new FunctionButton("START");
		funcbutton.setBounds(400,0,200,100);
		add(funcbutton);
		
		adr = new Address();
		
		for(int i = 0;i<piecenumber;i++){
			piece[i] = new PuzzlePanel(new Dimension(200,200),new Dimension(adr.start_x[i]*200,adr.start_y[i]*200));
			piece[i].setBounds(adr.start_x[i]*200+200, adr.start_y[i]*200+100, 200, 200);
			add(piece[i]);
		}		
		add(centerpanel);
		repaint();
	}
	
	public void start(){	
		removeAll();
		
		FrameworkPanel centerpanel = new FrameworkPanel();
		
		FunctionButton funcbutton = new FunctionButton("RESET");
		funcbutton.setBounds(400,0,200,100);
		add(funcbutton);
				
		adr.rondomAddress();
				
		for(int i = 0;i<9;i++){
			piece[i] = new PuzzlePanel(new Dimension(200,200),new Dimension(adr.start_x[i]*200,adr.start_y[i]*200));
			piece[i].setBounds(adr.rondom_x[i]*12, adr.rondom_y[i]*12, 200, 200);
			add(piece[i]);
		}
		add(centerpanel);
		repaint();
	}
	
	public void reset(){		
		removeAll();
		prerare(this.piecenumber);
		repaint();
	}
	
	public void piececheck(){
		
		for(int i = 0;i<9;i++){
			if( piece[i].lock == false) return;
		}
		setBackground(Color.RED);
	}
	
	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
	}
}
