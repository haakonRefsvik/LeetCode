import java.util.Arrays;

public class EnkeltTall {
    
    public static void main(String[] args){

        int nums[] = {4,1,2,1,2};
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i = i + 2){
            if(nums[i] != nums[i + 1]){
                System.out.println(nums[i]);
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
