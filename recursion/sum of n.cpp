//give the sum of n numbers


long long sum(long long n, int s);

long long sumFirstN(long long n) {
 sum(n,0);

}
long long sum(long long n, int s){
  if(n==0){
    return s;
  }
  else{
    s= s+n;
    sum(n-1,s);
  }

}