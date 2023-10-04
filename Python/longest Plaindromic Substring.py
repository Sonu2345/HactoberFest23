class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        c=""
        for i in range(len(s)):
            for j in range(i+1, len(s)+1): #Nested loop
                b=s[i:j]
                if b[:]==b[::-1]:
                    if len(b)>len(c):
                        c=b
            x=s[i:]
            if x[:]==x[::-1]:       #if statement for breaking
                if len(x)>=len(c):
                    return x
        return c