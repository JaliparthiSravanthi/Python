class Solution(object):
    def twoSum(self, numbers, target):
       d={}
       sum=0
       for i in range(len(numbers)):
        sum=target-numbers[i]
        if sum in d:
            return [d[sum]+1,i+1]
        else:
            d[numbers[i]]=i
       return -1