package Array.Arraylist;
import java.util.*;
public class pair_sum_1 {
    public static boolean sum_pair( ArrayList<Integer>list,int target ){
        int sum=0;
        for(int i =0;i<list.size();i++ ){
            for(int j=i+1;j<list.size();j++){
                sum=list.get(i)+ list.get(j);
                if(sum==target){
                    return true;
                }

            }
        }


        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>li=new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        int taget =11;
        System.out.println(sum_pair(li,taget));


    }
}
//output
//true