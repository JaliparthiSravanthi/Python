class Solution(object):
    def threeSum(self, nums):
        
        result = set()
        n = len(nums)

        for i in range(n - 2):
            d={}
            for j in range(i + 1, n ):
              
                k=-(nums[i]+nums[j])
                if k in d:
                    triplet = tuple(sorted([nums[i], nums[j],k]))
                    result.add(triplet)
    
                d[nums[j]]=1

        return [list(t) for t in result]
        
        
        