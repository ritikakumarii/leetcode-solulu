class Solution {
    public boolean all(String word){
        for(int i =0 ; i< word.length() ; i++){
                char ch = word.charAt(i);
        
            if(!Character.isUpperCase(ch)) return false;
        }
        return true;
    }
    public boolean none(String word){
        for(int i =0 ; i< word.length() ; i++){
                char ch = word.charAt(i);
            if(!Character.isLowerCase(ch)) return false;
        }
        return true;
    }
    public boolean onlyFirst(String word){
        if(Character.isUpperCase(word.charAt(0))){
            for(int i =1 ; i< word.length() ; i++){
                char ch = word.charAt(i);
             if(!Character.isLowerCase(ch)) return false;
            }
            
        }
        else return false;
        return true;
    }
    public boolean detectCapitalUse(String word) {
      return (all(word) || none(word) )|| onlyFirst(word);
    }
}