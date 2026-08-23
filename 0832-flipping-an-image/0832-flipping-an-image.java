class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int row =0 ; row< image.length ; row++){
            int i =  0;
            int j = image[0].length-1;
            while(i<j){
                int temp = image[row][i];
                image[row][i]=image[row][j];
                image[row][j]= temp;
                i++;
                j--;
            }
            for(int k=0; k<image.length ; k++){
                if (image[row][k]==1){
                    image[row][k]=0;
                }
                else{
                    image[row][k]=1;
                }
            }
        }
        return image;
    }
}