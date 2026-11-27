class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;
       
       int[][] dp = new int[m][n];
       for(int i =0 ; i< m ; i++){
        for(int j =0 ; j<n ; j++){
            dp[i][j]=-1;
        }
       }
       return path(0,0,m-1,n-1,dp,obstacleGrid); 
    }
    public int path(int row , int col , int m, int n , int[][] dp,int[][] obstacleGrid){
        if(row>m || col>n ||obstacleGrid[row][col]==1 ) return 0;
        if(row==m && col==n) return 1;
        if(dp[row][col]!=-1) return dp[row][col];
        return dp[row][col]= path(row+1,col,m,n,dp,obstacleGrid)+path(row,col+1, m , n ,dp,obstacleGrid);
    }    
    }
