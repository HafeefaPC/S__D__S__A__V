//pallindrome using recursion
//https://www.codingninjas.com/studio/problems/check-palindrome-recursive_624386?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

bool isPalindrome(string& str, int i);



bool isPalindrome(string& str, int i){
    if(i>=str.size()/2){
        if(str[i]!==str[str.size()-i-1])return false;
        return bool pal(str,i+1);
    }
}
void pal(string& str);

void pal(string& str) {
  isPalindrome(str,0);
 
}

//some changes needed