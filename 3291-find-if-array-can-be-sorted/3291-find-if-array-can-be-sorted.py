class Solution:
    def canSortArray(self, nums: List[int]) -> bool:
        for c in range(len(nums)):
            numSwaps=0
            for i in range(len(nums)-1):
                bin1 = bin(nums[i])[2::]
                bin2 = bin(nums[i+1])[2::]
                print(bin1 + "&" + bin2)
                if(nums[i]>nums[i+1] and bin1.count("1")==bin2.count("1")):
                    temp=nums[i]
                    nums[i]=nums[i+1]
                    nums[i+1]=temp
                    numSwaps+=1

            
            if(numSwaps==0):
                break

        

        print(nums)
        return all(nums[i] <=nums[i + 1] for i in range(len(nums) - 1))