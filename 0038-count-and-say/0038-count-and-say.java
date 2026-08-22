class Solution {
    public String countAndSay(int n) {
      if(n==1) return "1";
      String prev = countAndSay(n-1);
      StringBuilder ans = new StringBuilder(); 
      int i =0; 
    while(i<prev.length()){
        char ch = prev.charAt(i);
        int count=0;
        while(i<prev.length() && prev.charAt(i)==ch){
         count++;
         i++;
        }
        ans.append(count);
        ans.append(ch);
      }
      return ans.toString();
    }
}