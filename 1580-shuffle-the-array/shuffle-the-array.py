class Solution(object):
    def shuffle(self, nums, n):
        lst=[]
        s=0;
        m=n;
        for i in range(0,len(nums)):
            if(i%2==0):
                lst.append(nums[s])
                s+=1
            else:
                lst.append(nums[m])
                m+=1
        return lst
