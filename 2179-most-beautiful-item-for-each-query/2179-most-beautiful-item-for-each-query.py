class Solution:
    def maximumBeauty(self, items: List[List[int]], queries: List[int]) -> List[int]:
        items.sort()
        print(items)
        queries = sorted([(q, i) for i, q in enumerate(queries)])
        print(queries)
        res = [0]*len(queries)
        counter, maxBeauty = 0, 0
        for query, originalIndex in queries:
            while (counter < len(items)) and (items[counter][0] <= query):
                maxBeauty = max(items[counter][1], maxBeauty)
                counter += 1
            res[originalIndex] = maxBeauty
        return res