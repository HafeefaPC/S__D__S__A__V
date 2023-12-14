package search;

public class index {
    public static void main(String[] args){
        int[] array ={2,5,38,49,6,3}  ;
        int target = 6;
        int start =2;
        int end= 5;
        int a = linear(array,target,start,end);
        System.out.print(a);
      }
      static int linear(int[] arr,int t ,int start,int end){
  
          if(arr.length == 0){
              return -1;
          }
  
          for(int i =start;i<end; i++){
              if( t== arr[i]){
                  return i;
              }
          }
          return -1;
      }
}
