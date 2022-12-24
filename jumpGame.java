package LeetCode;

public class jumpGame {
    public static int jump(int[] nums) {
        int curReach = 0;
        int curMax = 0;
        int jumps = 0;
        //{2, 3, 1, 4};
        for(int i = 0;i<nums.length-1;i++){
            if(i+nums[i] > curMax){ //sbse pehle ith apni reach pe jaega
                
                curMax = i +nums[i]; 
                System.out.println("CurMax kya h " + curMax);
            }
            
            if(i==curReach){
                jumps++;
                System.out.println("jump kya h " + jumps);
                curReach = curMax;
                System.out.println("CurReach kya h + curMax " + curReach + curMax);
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4};
        int x = 0;

        x = jump(nums);
        System.out.println(x);

    }
}
