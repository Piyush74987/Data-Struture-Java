package Java.Basic_Problem;

public class invesment {
    public static void main(String[] args) {
        int invesment =10000;
        int year=30;
        for(int i =0;i<year;i++){
            int sum = invesment*6;
            invesment+=sum/100;
            System.out.println(invesment);
        }
    }
}
