package Recursion;

public class N_Queens_Prob {
    public static void main(String[] args) {
        int n=4;
        PrintBoard(n);

    }
    
    static void placeQueens(char[][] board,int row,int n){
        if(row==n){
            PrintBoard(board,n);
            return;
        }
        for(int col=0;col<n;col++){
            
        }
    }
    static void PrintBoard(char board[][],int n){
     

        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          System.out.print(board[i][j]);;
        }
        System.out.println();
        }
    }
}
