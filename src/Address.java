import java.util.Random;


public class Address {
	
	int start_x[] = new int[]{0,0,0,1,1,1,2,2,2};
	int start_y[] = new int[]{0,1,2,0,1,2,0,1,2};
	int rondom_x[] = new int[]{0,0,0,1,1,1,2,2,2};
	int rondom_y[] = new int[]{0,1,2,0,1,2,0,1,2};
	
	public void startAddress(){
		for(int i = 0;i<9;i++){
			rondom_x[i] = i;
			rondom_y[i] = i;
		}
	}
	
	public void rondomAddress(){
		Random rnd = new Random();	
		int rx ,ry;
		
		for(int i = 0;i<9;i++){
			rx = rnd.nextInt(50);
			ry = rnd.nextInt(50);
			rondom_x[i] = rx;
			rondom_y[i] = ry;
		}
		
	}
	
}
