import java.util.Arrays;

public class GenererParanteser {
    
    public static void main(String[] args){

        int m = 6;
        int[] nums1= {-1,0,0,3,3,3,0,0,0};
        int[] nums2= {2, 5, 6};
        merge(nums1, 6, nums2, 3);

        outerloop:
        for(int j = 0; j < nums2.length; j++){
            for(int l = 0; l < nums1.length; l++){

                if(nums2[j] > nums1[l] && l < m){
                    continue;
                }

                int nyttTall = nums2[j];
                int i = nums1.length;
                int beho;

                while(i > l){
                    beho = nums1[i - 1];
                    try {
                        nums1[i - 1] = nums1[i];
                        nums1[i] = beho;
                    } catch (Exception e) {
                    }

                    if(i == l+1){
                        nums1[i - 1] = nyttTall;
                    }

                    i--;
                }

                m++;
                continue outerloop;
            }
        }
        System.out.print("1: ");

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //variables to work as pointers
        int i=m-1; // will point at m-1 index of nums1 array
        int j=n-1; // will point at n-1 index of nums2 array
        int k=nums1.length-1; //will point at the last position of the nums1 array

        // Now traversing the nums2 array
        while(j>=0){
            // If element at i index of nums1 > element at j index of nums2
            // then it is largest among two arrays and will be stored at k position of nums1
            // using i>=0 to make sure we have elements to compare in nums1 array
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--; 
                i--; //updating pointer for further comparisons
            }else{
                // element at j index of nums2 array is greater than the element at i index of nums1 array 
                // or there is no element left to compare with the nums1 array 
                // and we just have to push the elements of nums2 array in the nums1 array.
                nums1[k] = nums2[j];
                k--; 
                j--; //updating pointer for further comparisons
            }
        }

        System.out.print("2: ");
        System.out.println(Arrays.toString(nums1));
      }
}
