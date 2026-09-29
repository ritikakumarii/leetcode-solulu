class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> set = new HashSet<>();
      int i =0; 
      int j =0;
      int maxl=0;
      int len=0;
      while(j<s.length()){
        if(!set.contains(s.charAt(j))) {
          set.add(s.charAt(j));
           len= j-i+1;
          j++;
         
          maxl=Math.max(maxl,len);
        }
        else{

            set.remove(s.charAt(i));
            i++;
        }
        

      }
      return maxl;
       
    }
}