package LeetCode;

public class rotatebyK {
    public static void swap(int[] arr, int i, int k) {
        int len = arr.length;
        
        int j =(i+k)%len;
        int t =(j+k)%len;
        if(len> 1) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[t] = temp;
        }
        
    }
    
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int last = nums[len-1];
        if(k==0 || k>len) {
           return ; 
        }
        
        for(int i=0; i<k; i++) {
            swap(nums, i, k);
        }
        if(len> 1) {
            nums[k-1] = last;
        }
   
    }
    public static void main(String[] args) {
        int[] nums = {1,2};
        rotate(nums, 3);
        
    }
}
