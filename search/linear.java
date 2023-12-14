package search;

public class linear {
    public static void main(String[] args){
      int[] array ={2,5,38,49,6,3}  ;
      int target = 6;
      int a = linear(array,target);
      System.out.print(a);
    }
    static int linear(int[] arr,int t){

        if(arr.length == 0){
            return -1;
        }

        for(int i =0;i<arr.length; i++){
            if( t== arr[i]){
                return i;
            }
        }
        return -1;
    }
    
    static int linear2(int[] arr,int t){

        if(arr.length == 0){
            return -1;
        }

        for(int i =0;i<arr.length; i++){
            if( t== arr[i]){
                return arr[i];
            }
        }
        return -1;
    }

    static boolean linear3(int[] arr,int t){

        if(arr.length == 0){
            return false;
        }

        for(int element : arr){
           if(element == t){
            return true;
           }
        }
        return false;
    }
    
    
}
