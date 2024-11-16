package Java.conditional_loop;



public class bulid_in_function {
    public static void main(String[] args) {
        System.out.println("bulid in function use");
        String a="   piyush is great    i     ";
        String b=a.trim();
        //The trim() method in Java returns a new string that is a copy of the
        // original string but with leading and trailing whitespace removed
        System.out.println(b);
        String f=a.strip();
        System.out.println(f);
        String c= a.toUpperCase();
        System.out.println(c);
        String d=c.toLowerCase();
        System.out.println(d);
        byte[] e=c.getBytes();
        System.out.println(e);


    }
}
