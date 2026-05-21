class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     for(int i=0;i<image.length;i++){
        int l=0;
        int r=image[i].length-1;
        while(l<=r){
            int temp=image[i][l]^1;
            image[i][l]=image[i][r]^1;
            image[i][r]=temp;
            l++;
            r--;
        }
        /*for(int j=0;j<image[i].length;j++){
            if(image[i][j]==1)
                image[i][j]=0;
            else
              image[i][j]=1;
        } */  
     }  
    return image; 
    }
}