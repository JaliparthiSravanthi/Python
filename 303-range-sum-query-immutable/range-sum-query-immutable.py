class NumArray(object):
    def __init__(self, nums):
        self.lst=[0]*len(nums)
        sum=0
        for i in range(len(nums)):
            sum+=nums[i]
            self.lst[i]=sum
            
        

    def sumRange(self, left, right):
       if(left==0):
        return self.lst[right]
       else:
        return (self.lst[right]-self.lst[left-1])
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)