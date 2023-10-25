//facotial if less than n than print
//https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

vector<long long> ans;

long long factorial(long long n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

vector<long long> factorialNumbers(long long n) {
    for (int i = 1; i <= n; i++) {
       
        long long fact = factorial(i);
        if(fact<=n) 
            ans.push_back(fact);
    }
    return ans;
}