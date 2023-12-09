package array;

public class max {
    public static void main(String[] args){
        int[] arr={10,30,40,27,50};
        int max=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("the maximum array element is" + max);
    }
}
