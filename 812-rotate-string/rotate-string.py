class Solution(object):
    def rotateString(self, s, goal):

        if len(s) != len(goal):
            return False

        for j in range(len(s)):

            if s[j] != goal[0]:
                continue

            st = ""
            for l in range(j):
                st += s[l]

            strs = ""
            for m in range(j, len(s)):
                strs += s[m]

            if strs + st == goal:
                return True

        return False