class Solution(object):
    def numOfSubarrays(self, arr, k, threshold):
        s=0
        c=0
        ws=0
        avg=0
        for i in range(k):
           s+=arr[i]
        if(s/float(k)>=threshold):
            c+=1
        ws=s
        for j in range(k,len(arr)):
            ws=ws-arr[j-k]+arr[j]
            if(ws/float(k)>=threshold):
                c+=1
        return c
