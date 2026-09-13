class Solution {
    List<String> ans = new ArrayList<>();
    public void helper(StringBuilder sb, int i){
        if(i==sb.length()){
            ans.add(sb.toString());
            return;
        }
        if(Character.isDigit(sb.charAt(i))){
            helper(sb,i+1);
        }
        else{
            sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
            helper(sb,i+1);
            sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            helper(sb,i+1);
            
        }
    }
   
    public List<String> letterCasePermutation(String s) {
      StringBuilder sb = new StringBuilder(s);
       helper(sb,0);
      return ans;
     
    }
}