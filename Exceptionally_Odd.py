#User function Template for python3
from collections import Counter
class Solution:
    def getOddOccurrence(self, arr, n):
        # code here 
        c=0
        freq = Counter(arr)
        for i in freq:
            if freq[i]%2!=0:
                return i
