class Solution {
    public int compress(char[] chars) {
       int i =0; 
      int j=0;
        StringBuilder sb = new StringBuilder("");
        while(i<chars.length ){
            char ch =chars[i];
            int count=0;
            while(i<chars.length && chars[i]==ch){
            count++;
            i++;
            }
           chars[j++]=ch;
            if(count>1){
               String str=String.valueOf(count);
               for(char a:str.toCharArray()){
                chars[j++]=a;
               }
            }
        }
        return j; 
    }
}