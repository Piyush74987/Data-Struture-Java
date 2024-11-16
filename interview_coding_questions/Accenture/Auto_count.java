package interview_coding_questions.Accenture;

import java.util.Scanner;

public class Auto_count {

    public static int auto_count1(String str){
        if(str==null){
            return 0;
        }
        int count=0;
        int inter=Integer.parseInt(str);
        int arr[]=new int[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=str.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return (arr.length-count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(auto_count1(str));

    }
}
