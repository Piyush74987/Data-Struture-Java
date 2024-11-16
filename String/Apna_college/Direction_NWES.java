package String.Apna_college;

public class Direction_NWES {
    public static void main(String[] args) {
        String path="WNEENESNNN";
        System.out.println(paths(path));

    }

    public static float paths(String str){
//        int x=0;
//        int y=0;
        int X=0;
        int Y=0;
        for(int i=0;i<str.length();i++){
            // north +y
            if(str.charAt(i)=='N'){
                Y++;
            }
            // south -y
            else if(str.charAt(i)=='S'){
                Y--;
            }
            else if(str.charAt(i)=='E'){
                X++;
            }
            else{
                X--;
            }
        }

        int x2=X*X;
        int y2=Y*Y;
        return (float)Math.sqrt(x2+y2);
    }

}
