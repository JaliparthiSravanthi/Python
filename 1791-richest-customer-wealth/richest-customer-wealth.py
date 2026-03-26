class Solution(object):
    def maximumWealth(self, accounts):
       mc=0
       for i in range(0,len(accounts)):
        c=0
        for j in range(0,len(accounts[i])):
            c+=accounts[i][j]
        if(c>mc):
            mc=c
       return mc

        