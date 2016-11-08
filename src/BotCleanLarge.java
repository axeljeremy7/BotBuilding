import java.util.ArrayList;
import java.util.Scanner;

public class BotCleanLarge {
	int x;
	int y;
	static ArrayList<BotCleanLarge> nodes;
	
	public BotCleanLarge(int i, int j){
		x=i;
		y=j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        int [] dim = new int[2];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<2;i++) dim[i] = in.nextInt();
        String board[] = new String[dim[0]];
        for(int i=0;i<dim[0];i++) board[i] = in.next();
        in.close();
        next_move(pos[0], pos[1], dim[0], dim[1], board);

	}
	
	public static void next_move(int posr, int posc, int dimh, int dimw, String[] board){
        char [] t = new char[dimh*dimw];
		char[] ch = new char[dimh];
		
		for(int i=0, k=0; i< dimh; i++){	
			for( int j=0; j < dimw; j++){
				ch = board[i].toCharArray(); 
				t[k] = ch[j];
				k++;
			}
		}
		
		nodes = new ArrayList<>();
		
		char [][] che = new char[dimh][dimw];
		int l=0;
		for(int i=0; i < dimh; i++){
			for(int j=0; j<dimw; j++){
				che[i][j]= t[l];
				if(che[i][j] == 'd'){
					BotCleanLarge node = new BotCleanLarge(i,j);
					nodes.add(node);
					
				}
				l++;
				//System.out.print(che[i][j]);
			}
			//System.out.println();
		}
			
		int posi=0;
		int posj=0;
		int minValue = 8;
		for(int i=0; i< nodes.size(); i++){
			int a = Math.abs(nodes.get(i).x - posr);
			int b = Math.abs(nodes.get(i).y - posc);
			if (a+b < minValue){
				minValue = a+b;
				posi=nodes.get(i).x;
				posj=nodes.get(i).y;
		    }
		}
		
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
    }

}
