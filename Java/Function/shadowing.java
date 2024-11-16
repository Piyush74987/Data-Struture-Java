package Java.Function;

public class shadowing {
     static int x= 10; // we always need to put static to acess it anywehere


    public static void fun(){
        System.out.println(x);//10 at first time // 40 at second time
         x=20;
        System.out.println(x);//20
        int x = 30;
        System.out.println(x);//30
    }

    public static void main(String[] args) {
        System.out.println(x);//10
        int x =50;
        System.out.println(x);//50
        fun();
        x=40;
        System.out.println(x);//40
        fun();




    }
}
//output
//
//        10
//        50
//        10
//        20
//        30
//        40
//        20
//        20
//        30
