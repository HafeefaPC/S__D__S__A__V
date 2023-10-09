//print name N times using recursion


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