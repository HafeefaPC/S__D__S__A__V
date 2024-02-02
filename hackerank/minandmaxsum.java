// Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

// Sample Input

// 1 2 3 4 5
// Sample Output

// 10 14

package hackerank;

import java.util.Collections;
import java.util.List;

public class minandmaxsum {
    public static void miniMaxSum(List<Integer> arr) {
     int n=arr.size();
     long sum1=0;
     Collections.sort(arr);
     for(int i=0;i<n;i++){
         sum1 =sum1+ arr.get(i);
     }
     System.out.print((sum1-arr.get(n-1))+" "+(sum1-arr.get(0)));
     

    }
}
