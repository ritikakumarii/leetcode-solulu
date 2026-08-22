class Solution {
    public boolean checkDivisibility(int n) {
    int sum =0;
    int dig =n;
    int pro =1;
    while(dig>0){
        sum+=dig%10;
        pro *=dig%10;
        dig=dig/10;
    }
    return n%(sum+pro)==0;
    }
}