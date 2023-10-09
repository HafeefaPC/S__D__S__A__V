//print name N times using recursion

void fun(vector<string> &ans , int n ){

   if(n==0)  return;

    ans.push_back("Coding Ninjas");
 

    fun(ans , n-1);     

}

 

 

vector<string> printNTimes(int n) {    

   vector<string> ans;

 

    fun(ans , n);

 

    return ans;

 }
