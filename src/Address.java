import java.util.Random;


public class Address {
	
	int x[] = new int[]{0,0,0,1,1,1,2,2,2};
	int y[] = new int[]{0,1,2,0,1,2,0,1,2};
	
	public void rondomAddress(){
		Random rnd = new Random();	
		int rx ,ry;
		
		for(int i = 0;i<9;i++){
			rx = rnd.nextInt(4);
			ry = rnd.nextInt(4);
			x[i] = rx;
			y[i] = ry;
		}
		
	}
	
}
