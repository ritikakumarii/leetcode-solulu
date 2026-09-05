class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>>ans=new ArrayList<>();
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])) ;
       int start=intervals[0][0];
       int end=intervals[0][1];
       for(int i =1 ; i< intervals.length ; i++){
        if(end>=intervals[i][0]){
           end=Math.max(end,intervals[i][1]);
        }
         else{
        ans.add(Arrays.asList(start,end));
        start=intervals[i][0];
        end=intervals[i][1];
         }  
           
        }
        ans.add(Arrays.asList(start,end));
       
       int[][] arr = new int[ans.size()][2];
       for (int i = 0; i < ans.size(); i++) {
    arr[i][0] = ans.get(i).get(0);
    arr[i][1] = ans.get(i).get(1);
}
return arr;

}   

    
}