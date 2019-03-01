import java.util.Random;


public class Address {
	
	int start_place[][];
	int rondom_place[][];
	int piecenumber;
	
	public Address(int piecenumber){
		this.piecenumber = piecenumber;
		start_place = new int[piecenumber][piecenumber];

		for(int i = 0; i< piecenumber ;i++) {
			for(int j = 0; j< piecenumber ;j++) {
					start_place[i][j] = j;
			}
		}
	}
	
	public void rondomAddress(){
		rondom_place = new int[piecenumber][piecenumber];
		Random rnd = new Random();	
	
		for(int i = 0; i< piecenumber ;i++) {
			for(int j = 0; j< piecenumber ;j++) {
				rondom_place[i][j] = rnd.nextInt(500);
			}
		}
		
	}
	
}
