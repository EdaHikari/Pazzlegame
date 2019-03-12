import java.awt.Dimension;
import java.util.Random;


public class Address {
	
	Dimension start_place[][];
	Dimension rondom_place[][];
	int piecenumber;
	
	public Address(int piecenumber){
		this.piecenumber = piecenumber;
		start_place = new Dimension[piecenumber][piecenumber];

		for(int i = 0; i< piecenumber ;i++) {
			for(int j = 0; j< piecenumber ;j++) {
					start_place[i][j] = new Dimension();
					start_place[i][j].width = 200+i*(600/piecenumber);
					start_place[i][j].height = 100+j*(600/piecenumber);
			}
		}
	}
	
	public void rondomAddress(){
		rondom_place = new Dimension[piecenumber][piecenumber];
		Random rnd = new Random();	
	
		for(int i = 0; i< piecenumber ;i++) {
			for(int j = 0; j< piecenumber ;j++) {
				rondom_place[i][j] = new Dimension();
				rondom_place[i][j].width = 200+rnd.nextInt(500);
				rondom_place[i][j].height = 100+rnd.nextInt(500);
			}
		}
		
	}
	
}
