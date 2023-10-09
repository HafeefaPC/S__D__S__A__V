//print numbers from n to 1


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