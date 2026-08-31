class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int greed = 0;
        int size =0;
        
        while(size<s.length && greed<g.length ){
            if(g[greed]<=s[size]){
                greed++;
                size++;

            }
            else size++;
        }
      return greed;  
    }
}