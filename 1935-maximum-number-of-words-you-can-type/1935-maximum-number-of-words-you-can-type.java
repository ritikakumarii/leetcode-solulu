class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
    String[] arr = text.split(" ");
    HashSet<Character> set = new HashSet<>();
    int count=0;
    for(int i =0 ; i< brokenLetters.length() ; i++){
        char ch = brokenLetters.charAt(i);
        set.add(ch);
    }
   for(int i =0 ; i<arr.length ; i++){
    boolean flag=true;
    for(int j =0 ; j<arr[i].length() ; j++){
        char ch = arr[i].charAt(j);
        if(set.contains(ch)){
            flag =false;
        }
    }
    if(flag) count++;
   }
   return count;
    }
}