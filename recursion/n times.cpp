//print name N times using recursion
//https://www.codingninjas.com/studio/problems/print-1-to-n_628290?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

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
