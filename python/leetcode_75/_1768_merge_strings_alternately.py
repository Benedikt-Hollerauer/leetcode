class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged_alternately_result = ""
        if len(word1) > len(word2):
            for i in range(0, len(word1)):
                if len(word2) -1 < i:
                    merged_alternately_result = merged_alternately_result + word1[i]
                else:
                    merged_alternately_result = merged_alternately_result + word1[i] + word2[i]
        else:
            for i in range(0, len(word1)):
                if len(word1) -1 < i:
                    merged_alternately_result = merged_alternately_result + word2[i]
                else:
                    merged_alternately_result = merged_alternately_result + word1[i] + word2[i]
        return merged_alternately_result

result = Solution().mergeAlternately("abcd", "pq")
print(result)