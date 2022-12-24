package LeetCode;

public class kthMaxElement {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        //print(a);
        int i=0,j=0,k=0;
        
        int[] ans = new int[a.length + b.length];

        while(i<a.length && j<b.length) {
            if(a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            }
            else{
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            ans[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;

    }


    public static int[] mergeSort(int[] arr, int lo, int hi) { //1
        if (lo == hi) {                                                                      //2
          int[]ba = new int[1];
          ba[0] = arr[lo];
          return ba;
        }
        int mid = (lo + hi) / 2;                                                     //3
        int[] f = mergeSort(arr, lo, mid);                                 //4
        int[] s = mergeSort(arr, mid + 1, hi);                        //5
        int[] fin = mergeTwoSortedArrays(f, s);                 //6
        return fin;                                                                     //7
      }

    public static void main(String[] args) {
        int[] arr = {3,2,5,6,4};

        int[] output = mergeSort(arr, 0, 4);
        for(int i=0; i<output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
