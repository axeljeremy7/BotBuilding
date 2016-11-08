import java.util.Scanner;

public class BotSavePrincess1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }
        in.close();
        /**
         for(int i=0; i< grid.length; i++){
        	
        	System.out.print(grid[i] + "   ");
        	
        }
         */
        
        System.out.println();
        displayPathtoPrincess(m,grid);

	}
	
	public static void displayPathtoPrincess(int n, String grid[]){  
		
		char [] c = new char[n*n];
		
		char[] ch = new char[n];
		
		int pos=0;
		
		int m=0;
		
		
		for(int i=0, k=0; i< n; i++){	
			
			for( int j=0; j < n; j++){
				ch = grid[i].toCharArray(); // 3 cosas
				c[k] = ch[j];
				k++;
			}
		
		}
		///**
		 for(int i=0; i< c.length; i++){
        	if(c[i] == 'p'){
        		System.out.println("p= "+i);
        		
        		pos=i;
        	}
        	if(c[i] == 'm'){
        		System.out.println("m= "+i);
        		
        		m=i;
        	}
        	//System.out.print(c[i]);
        	
        }
		// */
		 
		 // (n+1)/2 es la posicion de m
		 
		 // 0, n-1 , n*(n-1) , ((n*n) -1)  posiciones de la princesa
		 
		// (n-1)/2 move left or right
		 
		 
		if(pos == 0){
			for(int i=0; i< (n-1)/2;i++){
				System.out.println("LEFT");
			}
			for(int i=0; i< (n-1)/2;i++){
				System.out.println("UP");
			}
		}
		
		if(pos == n*(n-1)){
			for(int i=0; i< (n-1)/2;i++){
				System.out.println("LEFT");
			}
			for(int i=0; i< (n-1)/2;i++){
				System.out.println("DOWN");
			}
			
		}
		
		if(pos == n-1 ){
			for(int i=0; i< (n-1)/2;i++){
				System.out.println("RIGHT");
			}
			for(int i=0; i< (n-1)/2;i++){
				System.out.println("UP");
			}
		}
		
		if(pos == (n*n) -1 ){
			for(int i=0; i< (n-1)/2;i++){
					System.out.println("RIGHT");
			}
			for(int i=0; i< (n-1)/2;i++){
				System.out.println("DOWN");
			}		
		}
		 
	}


}
