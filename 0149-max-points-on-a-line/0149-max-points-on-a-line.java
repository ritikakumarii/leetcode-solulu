class Solution {
    private int gcd(int a , int b){
        while(b!=0){
            int temp = a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public int maxPoints(int[][] points) {
        if(points.length<=2) return points.length;
        int ans =1;
       
        for(int i =0 ; i< points .length; i++){
             HashMap<String, Integer> map = new HashMap<>();
            for(int j =i+1 ; j<points.length ; j++){
                int dx = (points[j][1]-points[i][1]);
                int dy =(points[j][0]-points[i][0]);
            //    vertical line
            if(dx==0){
                dx=0;
                dy=1;

            }
            else if(dy ==0){
                dx=1;
                dy=0;
            }
            else{
                int g = gcd(Math.abs(dx), Math.abs(dy));
                dx= dx/g;
                dy=dy/g;
                if(dx<0){
                    dx=-dx;
                    dy=-dy;
                }
            }
            String slope = dy+"/" + dx;
            map.put(slope, map.getOrDefault(slope,0)+1);
            
          ans =Math.max(ans, map.get(slope)+1);
        }
        }
        return ans;
    }
    
}