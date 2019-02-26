package Interface;

import java.util.Random;

public class UFclient {
	public static int NumOfPair(int n){
		WQUPC wqupc = new WQUPC(n);
		int NumPairsGen=0;
		while(wqupc.count() > 1){
			Random rand = new Random();
			int  p = rand.nextInt(n);
			int q = rand.nextInt(n);
		
			if (wqupc.connected(p, q)){
				NumPairsGen++;
				continue;
			}
			else wqupc.union(p, q);
				NumPairsGen++;
				
			}
		return NumPairsGen;
		}	
	
	public static void main(String[]args){
		int[] var={10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};
		int avg=0;
		for(int i=0;i<10;i++){
			
			for (int j=0;j<100;j++){
				avg+=NumOfPair(var[i]);
	}
			
			System.out.println(avg/100);
			avg=0;
		
		}
		
		}
	}

