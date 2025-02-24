class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] indices = new int[2];
        int p = 0;
        int q = numbers.length -1;
        int temp;
        while(p<q){

            temp =numbers[p]+numbers[q];
            if(temp == target){
                indices[0] = p+1;
                indices[1] = q+1;
                return indices;
            }else if(numbers[p]+numbers[q] < target){
                p++;
            }else if(numbers[p]+numbers[q] > target){
                q--;
            }
        }

        return indices;
    }
}
