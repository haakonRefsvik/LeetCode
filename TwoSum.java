import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    
    public static void main(String[] args){

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {2, 2, 7, 11, 15};
        int target = 17;
        int sisteTall;
        

        for(int i = 0; i < nums.length; i++){
        
            sisteTall = target - nums[i];

            if(map.containsValue(sisteTall)){
                int[] output = {nums[i], sisteTall};
                System.out.println(map.get(sisteTall));
                System.out.println((sisteTall));

            }

            map.put(nums[i], i);
        }

    }

}
