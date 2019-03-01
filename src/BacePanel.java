import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class BacePanel extends JLayeredPane {
	
	PuzzlePanel piece[][];
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
		welcome.setText("<html><center>!!!PuzzleGame!!!<br>好きなピース数を下から選んでね</center></html>");
		welcome.setBounds(150,0,800,200);
		welcome.setFont(new Font(Font.SANS_SERIF,Font.BOLD,40));
		add(welcome);
		
		PieceButton piecebutton[] = new PieceButton[4];
		for(int i = 0;i<4;i++){
			piecebutton[i] = new PieceButton(i+3);
			piecebutton[i].setBounds(300,i*100+200,400,100);
			add(piecebutton[i]);
		}	
		repaint();
	}
	
	public void prerare(int piecenumber){
		System.out.println("prepare");
		this.piecenumber = piecenumber;
		removeAll();
		setLayout(null);
		setBackground(Color.YELLOW);
		
		FrameworkPanel centerpanel = new FrameworkPanel(piecenumber);
		
		FunctionButton funcbutton = new FunctionButton("START");
		funcbutton.setBounds(400,0,200,100);
		add(funcbutton);
		
		adr = new Address(piecenumber);
		piece = new PuzzlePanel[piecenumber][piecenumber];
		
		for(int i = 0;i<piecenumber;i++){
			for(int j = 0;j<piecenumber;j++){
				System.out.println(i);
				piece[i][j] = new PuzzlePanel(new Dimension(600/piecenumber,600/piecenumber),new Dimension(i*(600/piecenumber),j*(600/piecenumber)));
				piece[i][j].setBounds(i*(600/piecenumber)+200, j*(600/piecenumber)+100, 600/piecenumber, 600/piecenumber);
				add(piece[i][j]);
			}	
		}		
		add(centerpanel);
		repaint();
	}
	
	public void start(){	
		removeAll();
		
		FrameworkPanel centerpanel = new FrameworkPanel(piecenumber);
		
		FunctionButton funcbutton = new FunctionButton("RESET");
		funcbutton.setBounds(400,0,200,100);
		add(funcbutton);
				
		adr.rondomAddress();
		piece = new PuzzlePanel[piecenumber][piecenumber];
				
		for(int i = 0;i<piecenumber;i++){
			for(int j = 0;j<piecenumber;j++){
				piece[i][j] = new PuzzlePanel(new Dimension(600/piecenumber,600/piecenumber),new Dimension(i*(600/piecenumber),j*(600/piecenumber)));
				piece[i][j].setBounds(adr.rondom_place[i][j], adr.rondom_place[i][j], 600/piecenumber, 600/piecenumber);
				add(piece[i][j]);
			}
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
		
		for(int i = 0;i<piecenumber;i++){
			for(int j = 0;j<piecenumber;j++){
				if( piece[i][j].lock == false) return;
			}
		}
		setBackground(Color.RED);
	}
	
	@Override
	public void paint(Graphics graphics){
		super.paint(graphics);
	}
}
