class Solution(object):
    def rotateString(self, s, goal):

        if len(s) != len(goal):
            return False

        for j in range(len(s)):
            if s[j] == goal[0]:
                st = s[:j]
                strs = s[j:]

                if strs + st == goal:
                    return True

        return False