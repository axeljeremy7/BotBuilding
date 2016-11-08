import java.util.Scanner;

public class BotSavePrincess2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];
        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }
        
        in.close();

        //System.out.println();
        nextMove(n,r,c,grid);
        //look the other funcion

	}
	
	public static void nextMove(int n, int r, int c, String [] grid){
		char [] t = new char[n*n];
		
		char[] ch = new char[n];
	
		int posi = 0;
		
		int posj = 0;

		for(int i=0, k=0; i< n; i++){	
			
			for( int j=0; j < n; j++){
				ch = grid[i].toCharArray(); // 3 THINGS
				t[k] = ch[j];
				k++;
			}
		}
		char [][] che = new char[n][n];
		
		int l=0;
		for(int i=0; i < n; i++){
			for(int j=0; j<n; j++){
				che[i][j]= t[l];
				//System.out.print(che[i][j]);
				l++;
				if(che[i][j] == 'p'){
					posi=i;
					posj=j;
				}
			}
			//System.out.println();
		}
		/**
		System.out.println();
		System.out.println(che[r][c]);//m
		System.out.println(che[posi][posj]);//p
		System.out.println();
		 */

		
		if (c-posj>0){// column evalution
			if(r-posi<0){
				for(int i=0; i < c-posj; i++){
					System.out.println("LEFT");
				}
				for(int i=0; i< posi-r;i++){
					System.out.println("DOWN");
				}
			}else if(r == posi) {
				for(int i=0; i < c-posj; i++){
					System.out.println("LEFT");
				}
			}else{
				for(int i=0; i < c-posj; i++){
					System.out.println("LEFT");
				}
				for(int i=0; i< r-posi;i++){
					System.out.println("UP");
				}
			}
		}
		
		if (c-posj<0){// column evalution
			if(r-posi<0){
				for(int i=0; i < posj-c; i++){
					System.out.println("RIGHT");
				}
				for(int i=0; i< posi-r;i++){
					System.out.println("DOWN");
				}
			}else if(r == posi) {
				for(int i=0; i < posj-c; i++){
					System.out.println("RIGHT");
				}
			}else{
				for(int i=0; i < posj-c; i++){
					System.out.println("RIGHT");
				}
				for(int i=0; i< r-posi;i++){
					System.out.println("UP");
				}
			}
		}
		
		if(c==posj){
			if(r<posi){
				for(int i=0; i< posi-r;i++){
					System.out.println("DOWN");
				}
			}else{
				for(int i=0; i< r-posi;i++){
					System.out.println("UP");
				}
			}
		}

	  }
	
	/**
	 * This funtion can be re-used each time the postion change
	 * @param n
	 * @param r
	 * @param c
	 * @param grid
	 */
	
	public static void nextMove2(int n, int r, int c, String [] grid){
		char [] t = new char[n*n];
		
		char[] ch = new char[n];
	
		int posi = 0;
		
		int posj = 0;

		for(int i=0, k=0; i< n; i++){	
			
			for( int j=0; j < n; j++){
				ch = grid[i].toCharArray(); // 3 THINGS
				t[k] = ch[j];
				k++;
			}
		}
		char [][] che = new char[n][n];
		
		int l=0;
		for(int i=0; i < n; i++){
			for(int j=0; j<n; j++){
				che[i][j]= t[l];
				
				l++;
				if(che[i][j] == 'p'){
					posi=i;
					posj=j;
				}
			}
			
		}
		

		
		if (c-posj>0){// column evalution
			if(r-posi<0){
				
					System.out.println("DOWN");
				
			}else if(r == posi) {
				
					System.out.println("LEFT");
				
			}else{
				
					System.out.println("UP");
				
			}
		}
		
		if (c-posj<0){
			if(r-posi<0){
				
					System.out.println("DOWN");
				
			}else if(r == posi) {
				
					System.out.println("RIGHT");
				
			}else{
			
					System.out.println("UP");
				
			}
		}
		
		if(c==posj){
			if(r<posi){
				
					System.out.println("DOWN");
				
			}else{
				
					System.out.println("UP");
				
			}
		}
	
	}

}
