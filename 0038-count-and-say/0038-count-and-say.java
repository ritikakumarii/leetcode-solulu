class Solution {
    public String say (String s){
        if(s.length()==0) return "1";
        String ans ="";
        for(int i =0; i< s.length(); i++){
            int count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                i++;
                count++;
            }
            ans +=String.valueOf(count);
            ans+=s.charAt(i);
        }
      return ans;  
    }
    public String countAndSay(int n) {
        String ans ="";
        for(int i =n; i>=1 ; i--){
          ans = say(ans);
        }
       return ans; 
    }
}