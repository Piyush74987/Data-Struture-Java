package interview_coding_questions.Accenture;

public class number_product {
    public static int product(int n){
        if(n<5){
            return n;
        }
        int pro=1;
        pro=pro*product(n/2);
//        if(n%2==0){
//
//            pro=pro*product(n/2);
//        }
////        else {
////            pro=pro*product(n/2);
////        }
      return pro;
    }
    public static void main(String[] args) {
        int s=10;
        System.out.println(product(s));
    }
}
