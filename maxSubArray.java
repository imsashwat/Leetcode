package LeetCode;

public class maxSubArray {
   
        public static int maxSubArrays(int[] nums) {
            int pivot=0;          
            int curMax = Integer.MIN_VALUE;
            
            for (int i=0; i<nums.length; i++) {
                pivot = nums[i]; //-2 -1
                int sumSofar = pivot; //sumosfar=-2 -1
                
                for(int j=i+1; j<nums.length; j++) {
                    int pointer = j;  //1 
                    
                    sumSofar= nums[pointer] + sumSofar; //(-2-1) 
                    System.out.println("sum dekhlo "+ sumSofar);
                    if(sumSofar > curMax) {
                        curMax = sumSofar; //0
                        System.out.println("curmax dekhlo "+ curMax);
                    }
                }
                if(sumSofar > curMax) {
                    curMax = sumSofar; //0
                }
            }
            return curMax;
        }


        public static void main(String[] args) {
            int[] nums = {-1, -2};
            int x = maxSubArrays(nums);

            System.out.println(x);
        }
}
