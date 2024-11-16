package Array.Arraylist;
// pairs sum 1 is sorted and pairs sum 2 is not sorted
import java.util.ArrayList;

public class pair_sum_2 {
    public static boolean sum_pair(ArrayList<Integer> list, int target ){
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
        li.add(11);
        li.add(12);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        int taget =16;
        System.out.println(sum_pair(li,taget));


    }
}

