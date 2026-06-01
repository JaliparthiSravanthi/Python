class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
       int[] prefix=new int[n+1];
       prefix[0]=0;
       int sum=0;
       for(int i=1;i<=n;i++){
        sum+=cardPoints[i-1];
         prefix[i]=sum;
       }
       int[] suffix=new int[n+1];
       suffix[n]=0;
       int s=0;
       for(int j=n-1;j>=0;j--){
        s+=cardPoints[j];
        suffix[j]=s;
       }
       int mlen=0;
       for(int y=0;y<=k;y++){
        mlen=Math.max(mlen,prefix[y]+suffix[n-k+y]);
       }
    return mlen;
    }
}