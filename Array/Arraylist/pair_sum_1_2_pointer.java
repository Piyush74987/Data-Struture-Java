package Array.Arraylist;

import java.util.ArrayList;

public class pair_sum_1_2_pointer {
    public static boolean sum_pair( ArrayList<Integer>list,int target){
        int sum =0;
        int lp=0;
        int rp= list.size()-1;
        while(lp<rp){
            sum= list.get(rp)+ list.get(lp);
            if(sum==target){
                return true;
            }else if(sum>target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        int taget = 11;
        System.out.println(sum_pair(li, taget));
    }
}
