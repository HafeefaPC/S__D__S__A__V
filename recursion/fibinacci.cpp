//fibanacci using recursion
//https://www.codingninjas.com/studio/problems/print-fibonacci-series_7421617?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

vector<int> generateFibonacciNumbers(int n) {
   if(n<=1){
      return n;
   }
   else{}
   int last = generateFibonacciNumbers( n-1);
   int slast = generateFibonacciNumbers( n-2);
   return last + slast ;
      

}