
import java.util.ArrayList;
import java.util.Scanner;

public class BotClean {
	int x;
	int y;
	static ArrayList<BotClean> nodes;
	
	public BotClean(int i, int j){
		x=i;
		y=j;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        in.close();
        next_move(pos[0], pos[1], board);
	}
	
	
	
	
	
	
	public static void next_move(int posr, int posc, String[] board){
		int n=5;
		
        char [] t = new char[n*n];
		
		char[] ch = new char[n];


		for(int i=0, k=0; i< n; i++){	
			for( int j=0; j < n; j++){
				ch = board[i].toCharArray(); 
				t[k] = ch[j];
				k++;
			}
		}
		nodes = new ArrayList<>();
		
		char [][] che = new char[n][n];
		int l=0;
		for(int i=0; i < n; i++){
			for(int j=0; j<n; j++){
				che[i][j]= t[l];
				if(che[i][j] == 'd'){// che[i][j] != 'b' && che[i][j] != '-'
					BotClean node = new BotClean(i,j);
					nodes.add(node);
					
				}
				l++;
				//System.out.print(che[i][j]);
				
			}
		}
		
		
		
		
		//for(int i=0; i< nodes.size(); i++){
		//	System.out.println(nodes.get(i).x + " " + nodes.get(i).y);
			
		//}
		
		//System.out.println("\n");
		int posi=0;
		int posj=0;
		
		int minValue = 8;
		for(int i=0; i< nodes.size(); i++){
			int a = Math.abs(nodes.get(i).x - posr);
			int b = Math.abs(nodes.get(i).y - posc);
			//System.out.println(a);
			//System.out.println(b);
			if (a+b < minValue){
				minValue = a+b;
				posi=nodes.get(i).x;
				posj=nodes.get(i).y;
		    }
		}
		
		//System.out.println(minValue);
		
		
		if(minValue==0){
			if(posr == posi && posc == posj){
				System.out.println("CLEAN");
			}
		}
		else {
			
			if(posc < posj && posr != posi){
				System.out.println("RIGHT");
			}
			if(posc > posj && posr != posi){
				System.out.println("LEFT");
			}
			
			if(posr == posi && posc < posj){
				System.out.println("RIGHT");
			}
			
			if(posr == posi && posc > posj){
				System.out.println("LEFT");
			}
			
			if(posc == posj && posr < posi){
				System.out.println("DOWN");
			}
			
			if(posc == posj && posr > posi){
				System.out.println("UP");
			}
		}	
			
			
		
			
		
		
//
    }
	/**
	int minValue = 8;
	for(int j=0; j < n; j++){
		for(int i=0; i<n; i++){
			if (che[i][j] == 'd'){
				int a = i - posr;
				int b = j - posc;
				
				if (a+b < minValue){
					if(posr != i && posc !=j){
						minValue = a+b;
						posi=i;
						posj=j;
					}
					
				}
			}
		}
	}
	
	//System.out.println(minValue);
	System.out.println("d "+posi + " " + posj);
	System.out.println("bot "+posr + " " + posc);
	
	if(posr == posi){
		if(posc < posj){
			System.out.println("RIGHT");
		}else {
			System.out.println("LEFT");
		}
	}
	
	if(posr < posi){
		if(posc < posj){
			System.out.println("DOWN");
		}
	}
	
	if(posr > posi && posc > posj){
		System.out.println("UP");
	}
	
	if(posc == posj){
		if(posr > posi){
			System.out.println("UP");
		}else {
			System.out.println("DOWN");
		}
	}
	 */

}
