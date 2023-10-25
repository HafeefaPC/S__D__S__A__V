//https://www.codingninjas.com/studio/problems/sum-of-first-n-numbers_8876068?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//give the sum of n numbers


int sum(long long n, int s){
  if(n==0) return s;
  s=s+n;
  sum(n-1,s); 
}


long long sumFirstN(long long n) {
   sum(n,0);
}