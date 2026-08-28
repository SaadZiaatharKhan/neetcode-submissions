class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        while(j>i){
            if(numbers[j]+numbers[i] > target) j--;
            else if(numbers[j]+numbers[i] < target) i++;
            else{
                return new int[] {i+1,j+1};
            }
        }
        return new int[]{};
    }
}