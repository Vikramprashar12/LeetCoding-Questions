class Solution {
    public int numRescueBoats(int[] people, int limit) {
    	Arrays.sort(people);
    	int lightest=0,heaviest=people.length-1;
    	int count=0;
    	while(lightest<=heaviest) {
    		if(people[heaviest]+people[lightest]>limit) {
    			heaviest--;
    			count++;
    		}
    		else {
    			lightest++;
    			heaviest--;
    			count++;
    		}
    	}
    	return count;
    }
}