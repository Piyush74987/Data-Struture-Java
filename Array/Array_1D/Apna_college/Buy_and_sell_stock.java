package Array.Array_1D.Apna_college;
// appraoch
// we need to find maxmium profit between to days of buy and sell
// we cant sell stock before buying
public class Buy_and_sell_stock {
    public static int profit_stock(int arr[]){
        int buy_price=Integer.MAX_VALUE;
        int profit=0;
        int max_profit=0;
        int n= arr.length;

        for(int i=0;i<n;i++){  //int day[]={7,1,4,5,6,3};
            if(buy_price<arr[i]){
                profit=arr[i]-buy_price;
                max_profit=Math.max(profit,max_profit);
            }else{
                buy_price=arr[i];
            }
        }
        return max_profit;
//        int index=0;
//        int profit=0;
//        int buy_day=Integer.MAX_VALUE;
//        int n=arr.length;
//        for (int i =0;i<n;i++){
//            if(buy_day>arr[i]){
//                buy_day=arr[i];
//                index=i;
//            }
//        }for(int i=index+1;i<n;i++){
//            int sell_day=arr[i];
//            int profit_1=sell_day-buy_day;
//            profit=Math.max(profit_1,profit);
////            if(profit_1>profit){
////                profit=profit_1;
////            }
//        }

    }
    public static void main(String[] args) {
        //int day[]={7,1,4,5,6,3};
        int day[]={8,7,3,9,2,4,5};
        System.out.println(profit_stock(day));
    }
}
//output =6