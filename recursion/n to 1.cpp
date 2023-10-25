//print numbers from n to 1
//https://www.codingninjas.com/studio/problems/n-to-1-without-loop_8357243?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

void print(vector<int>&ans ,int x){
   if(x==0){
      return;
   }
    else{
      ans.push_back(x);
      print(ans,x-1 );
    }
}
vector<int>printNos(int x){
   vector<int>ans;
   print(ans,x);
   return ans;
}