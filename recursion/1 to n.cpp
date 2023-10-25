//print numbers from 1 to n using recursion
//https://www.codingninjas.com/studio/problems/print-1-to-n_628290?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

void print(vector<int>&ans, int x) {
  if (x==0) {
    return;
  } else {
    print(ans, x - 1);
     ans.push_back(x);
  }
}
vector<int>printNos(int x) {
  vector<int>ans;
  print(ans, x); 
  return ans;
}


