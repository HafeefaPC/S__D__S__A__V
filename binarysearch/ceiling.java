//smallest number greater than or equal to target
package binarysearch;

public class ceiling {
    public static void main(String[] args){
    int[] arr ={2,4,16,20,22,31,35} ;
   int target=25;
   System.out.println(celing(arr, target));
}
static int celing(int[] arr,int target){
    int s=0;
    int e=arr.length-1;
    while(s<=e){
        int mid=(s+e)/2;
        if(target<arr[mid]){
            e=mid-1;
        }
        else if(target>arr[mid]){
            s=mid+1;
        }
        else{
            return mid;
        }
    }
    return s ;
}
}