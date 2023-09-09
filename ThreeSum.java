import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List <Integer>> output = new LinkedList<>();
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

/*         for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                    if(i == j || i == k || j == k){
                        continue;
                    }
                    if(nums[i] + nums[j] + nums[k] == 0){
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        } */
    }
}
