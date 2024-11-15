class Solution:
    def maximumBeauty(self, items: list[list[int]], queries: list[int]) -> list[int]:
        answer = [0] * len(queries)
        items = sorted(items)
        queries = sorted([(q, i) for i, q in enumerate(queries)])

        itemsPointer, maxBeauty = 0, 0
        for q, i in queries:
            while itemsPointer < len(items) and items[itemsPointer][0] <= q :
                maxBeauty = max(items[itemsPointer][1], maxBeauty)
                itemsPointer += 1
            answer[i] = maxBeauty
        return answer