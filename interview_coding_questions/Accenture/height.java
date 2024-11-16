package interview_coding_questions.Accenture;

public class height {
    public static int height(int h, int v1,int v2){
        if(h==0){
            return 0;
        }
        int h1;
        return h*(int)(Math.pow((v1/v2),2));
    }

    public static void main(String[] args) {
        System.out.println(height(16,5,5));
    }
}
