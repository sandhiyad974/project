package newTEam;
import java.util.Scanner;   
   public class Minesweeper{
        public static void main (String [] args){
        int  size = 5;
        int  [] [] minesfield = new int [5] [5];
        char [] []outputField = new char [5][5];
        show (minesfield, outputField);
        showgame(outputField);
        boolean gameOver = false;
		    while (gameOver != true)
		    {
		       gameOver = playGame(minesfield, outputField);
		       showgame(outputField);  
		    }
      	}  
    
   
      
        public static void show (int [] [] mines, char [] [] output){
	        for (int i = 0; i < output.length; i++){
	            for (int j = 0; j < output[0].length; j++){
	               output[i][j] = ' ';
	            }
	         }
	        for (int i = 0; i <  mines.length; i++){
	            for (int j = 0; j < mines[0].length; j++){
	               mines[i][j] = (int)(Math.random() * 2);
	            }
	        }
      	}  
    
   
    	public static void showgame (char [] [] output){
        	for (int r = 0; r < output.length; r++){
         	   for (int c = 0; c < output[0].length; c++){
            	   System.out.print ( "("+ (char)output[r][c] + ")");
            	}
           		System.out.println();
        	} 
    	}
    
    
        
        public static int countMines (int [] [] mines, int r, int c){
	        int rMin = r-1;
	        int rMax = r+1;
	        int cMin = c-1;
	        int cMax = c+1;
	        if (r == 0){
	        	rMin = 0;
	        }
	        if (r == mines.length-1){
	        	rMax = mines.length-1;
	        }
	        if (c == 0){
	        	cMin = 0;
	        }
	        if (c == mines.length-1){
	        	cMax = mines.length-1;
	        }	        
	        int count = 0;
	        for(int i = rMin; i<= rMax; i++){
	            for(int j = cMin; j<= cMax; j++){
	           	//checks around square for bombs             
		            if(mines[i][j] == 1 && i != r && j !=c){
		                 count++;
		            }
	            }
	        }
	        return count;
     	}  
       
       
        private static boolean Winner(int [][] mines){
	        int count = 0;
	        int target = mines.length*mines.length;
	        for (int i = 0; i<mines.length; i++){
	            for(int j = 0; j<mines.length;j++){
	            	if(mines[i][j]==1 || mines[i][j]==-1){
	            	    count++;
	            	}
	            	if (count==target){
	            	    return true;
	            	}
	        	}            
	        }
	        return false;
        }
               
    
   
     
        public static boolean playGame (int [][] mines, char [] [] outputBoard){
	        Scanner keybd = new Scanner(System.in);
	        System.out.println("Enter row and column (row column):");
	        int row = keybd.nextInt();
	        int col = keybd.nextInt();
	        //1 = bomb
	        if (mines[row][col] == 1){
	        System.out.println("you lose.");
	        outputBoard[row][col]='X';
	        return true;
	        }
	        else{
	        	outputBoard[row][col]=(countMines(mines,row,col)+"").charAt(0);
	            //-1 used space
	            mines[row][col]=-1;
	           
	            if (Winner(mines)==true){
	            	System.out.println("Congratulations!");
	                return true;
	            }
	        	return false;
	        }
        }  
    } 