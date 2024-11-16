package Array.Array_1D.Apna_college;

import java.util.Arrays;


public class Trapping_rain_water {
    public static int trapping_rain(int arr[]){
        int trap_water=0;
        int n=arr.length;
        int left_most_water[]=new int [n];
        int right_most_water[]=new int[n];
        left_most_water[0]=arr[0];
        for(int i =1;i<n;i++){
            left_most_water[i]=Math.max(arr[i],left_most_water[i-1]);
        }
        right_most_water[n-1]=arr[n-1];
        for(int i =n-2;i>=0;i--){
            right_most_water[i]=Math.max(arr[i],right_most_water[i+1]);
        }
        System.out.println(Arrays.toString(left_most_water));
        System.out.println(Arrays.toString(right_most_water));
        for(int i=0;i<n;i++){
            int water_level=Math.min(left_most_water[i],right_most_water[i]);
            trap_water=trap_water+water_level-arr[i];
        }
        return trap_water;
    }

    public static void main(String[] args) {
        int wall_height[]={4,2,0,6,3,2,5};
        System.out.println(trapping_rain(wall_height));

    }
}
//output
//        [4, 4, 4, 6, 6, 6, 6]
//        [6, 6, 6, 6, 5, 5, 5]
//        11