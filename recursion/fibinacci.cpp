//fibanacci using recursion

vector<int> generateFibonacciNumbers(int n) {
   if(n<=1){
      return n;
   }
   else{}
   int last = generateFibonacciNumbers( n-1);
   int slast = generateFibonacciNumbers( n-2);
   return last + slast ;
      

}