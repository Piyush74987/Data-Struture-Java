package Backtracking;

public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        char [][] chess=new char [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chess[i][j]='x';
            }
        }
        Nqueen(chess,0);

    }
    public static void Nqueen(char chess[][],int i){
        if(i==chess.length){
            printboard(chess);
            return;
           // return;
        }
        for(int j=0;j< chess.length;j++){
            if(issafe(chess,i,j)){
                chess[i][j]='Q';
                Nqueen(chess,i+1);
                chess[i][j]='x';
            }
        }


    }
    public static void printboard(char chess [][]){
        System.out.println("----------------------");
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess[i].length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean issafe(char chess [][],int row ,int col){
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1, j=col-1;i>=0&&j>=0; i--, j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1;i>=0&&j<chess.length; i--, j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
//output
//        ----------------------
//        x Q x x
//        x x x Q
//        Q x x x
//        x x Q x
//        ----------------------
//        x x Q x
//        Q x x x
//        x x x Q
//        x Q x x