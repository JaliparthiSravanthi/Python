class Solution(object):
    def longestPalindrome(self, s):
       longest=""
       def circular(left,right):
        while(left>=0 and right<len(s) and s[left]==s[right]):
            left-=1
            right+=1
        return s[left+1:right]
       for i in range(len(s)):
        odd_palindrome=circular(i,i)
        even_palindrome=circular(i,i+1)
        if(len(odd_palindrome)>len(longest)):
            longest=odd_palindrome
        if(len(even_palindrome)>len(longest)):
            longest=even_palindrome
       return longest  

