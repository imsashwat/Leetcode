package LeetCode;
import java.util.*;
import java.util.Arrays;

public class unionIntersection {

    public static int removeDup(int[] a, int n) {
        if (n == 0 || n == 1) {
            return n;
        } 
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {             
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1]; 
        return j;
    }

    public static void getUnion(int[] a, int size1, int[] b, int size2) {
        int[] ans =new int[size1+size2];
        

        Arrays.sort(a);
        Arrays.sort(b);
        
        
        int a1 = 0;
        int b1 = 0;

        a1 = removeDup(a, size1);
        b1 = removeDup(b, size2);
        for(int t =0; t<b1; t++){
            System.out.println("see b " + b[t]);
        }
        
        //union doing
        int i=0;
        int j=0;
        int k =0;
        while(i<a1 && j<b1) {
            if(a[i] < b[j]) {  
                ans[k] = a[i];
                k++;
                i++;
            }
            if(a[i] > b[j]) {
                ans[k] = b[j];
                k++;
                j++;
            }
            else{
                ans[k] = a[i];
                i++;
                j++;
                k++;
            }
        }
        while(i<a1) {
            ans[k] = a[i];
            i++;
            k++;
        }

        while(j<b1) {
            ans[k] = b[j];
            j++;
            k++;
        }
        //for(int t =0; t<ans.length; t++){
          //  System.out.println(ans[t]);
        //}

    }

    public static void getIntersection(int[] a, int size1, int[] b, int size2) {
        int i=0;
        int j=0;

        while(i<size1 && j<size2) {
            if (a[i] > b[j]) {
                j++;
            }
 
            else if (b[j] > a[i]) {
                i++;
            }
            else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 5, 6, 2, 3, 5, 7, 3}; //i
        int[] b = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 }; //j

        getUnion(a, 9, b, 10);
        //getIntersection(a, 10, b, 10);

    }
}
