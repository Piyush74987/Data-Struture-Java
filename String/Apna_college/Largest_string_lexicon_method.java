package String.Apna_college;

public class Largest_string_lexicon_method {
    public static void main(String[] args) {
        String arr[] = {"apple", "mango", "banana", "watermeoln"};
        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        // here it compare a with m and b and w as w is bigger so it is largest

        System.out.println(largest);

    }

}
//output
//watermeoln
