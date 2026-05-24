class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
      int[] left=new int[k+1];
      int[] right=new int[k+1];
      left[0]=0;
      for(int i=1;i<=k;i++){
        left[i]=left[i-1]+cardPoints[i-1];
      }
      right[0]=0;
      for(int i=1;i<=k;i++){
        right[i]=right[i-1]+cardPoints[n-i];
      }
      int max=0;
      int mlen=0;
      for(int i=0;i<=k;i++){
         max=left[i]+right[k-i];
         mlen=Math.max(mlen,max);
      }
    return mlen;

    }
}