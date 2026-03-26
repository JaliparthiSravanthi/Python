class Solution(object):
    def diagonalSum(self, mat):
       sum=0;
       n=len(mat)
       for i in range(0,len(mat)):
        for j in range(0,len(mat[i])):
            if(i==j):
                sum+=mat[i][j]
            elif(i+j==n-1):
                sum+=mat[i][j]
       return sum
            
        