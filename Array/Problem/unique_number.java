package Array.Problem;
import java.lang.*;

public class unique_number {

        public static int findUnique(int[] a){

            int n = a.length;

            for(int i=0;i<n;i++){

                for(int j=i+1;j<n;j++){

                    if(a[i]==a[j]){

                        a[i] = a[j] = -1;

                    }

                }

            }

            for(int i=0;i<n;i++)

                if(a[i]>0)

                    return a[i];

            return 1;

        }

        public static void main(String[] args){

            int a[]={21,7,3,21,5,7,5};

            System.out.println(findUnique(a));

        }

    }

