class Solution {
    public String minWindow(String s, String t){
        if(t.length()>s.length())return "";
    int freq[] = new int[128];
    for(char ch:t.toCharArray()){
        freq[ch]++;
    }
    int i =0;
    int j=0;
    int start=0;
    int minl=Integer.MAX_VALUE;
    int count=t.length();
    while(j<s.length()){
        if(freq[s.charAt(j)]>0){
        count--;
        }
        freq[s.charAt(j)]--;
        while(count==0){
            if(j-i+1<minl){
                minl=j-i+1;
            
            start=i;}
            char ch =s.charAt(i);
            freq[ch]++;
            if(freq[ch]>0){
                count++;
            }
            i++;
        }
        j++;
    }
    if(minl==Integer.MAX_VALUE)return "";
    return s.substring(start,minl+start);
    
    }
}