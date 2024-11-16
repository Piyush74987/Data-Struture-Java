package Backtracking;

public class N_Queen_count {
    public static void main(String[] args) {
        int n=8;
        char [][] chess=new char [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chess[i][j]='x';
            }
        }
        Nqueen(chess,0);
        System.out.println( n +" queen problem how many solution can be made "+count);

    }
    static int  count=0;
    public static void Nqueen(char chess[][],int i){;
        if(i==chess.length){
            count++;
            return;
        }
        for(int j=0;j< chess.length;j++){
            if(issafe(chess,i,j)){
                chess[i][j]='Q';
                Nqueen(chess,i+1);
                chess[i][j]='x';
            }
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
//        4 queen problem how many solution can be made 2
//        5 queen problem how many solution can be made 10
//        8 queen problem how many solution can be made 92