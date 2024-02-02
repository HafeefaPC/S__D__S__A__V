//move zeros in the last of a sorted array
package problems;

public class movezero {
    public static int[] moveZeros(int n, int []a) {
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[j++]=a[i];
                }  
        }  
        while(j<n){
            a[j++]=0;    
        }
        
        return a;
    }
}
