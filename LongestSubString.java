import java.util.HashMap;

public class LongestSubString {
    
    public static void main(String[] args){
        String s = "ASF";

        System.out.println(s.indexOf("A", 1));
    }

    public static int lengthOfLongestSubstring(String s) {
    HashMap<String, Integer> usedChar = new HashMap<>();
    int max = 0;
    int leftIndex = 0;
    String character;

    for(int i = 0; i < s.length(); i++){
        character = String.valueOf(s.charAt(i));

        if(usedChar.containsKey(character) && usedChar.get(character) >= leftIndex){
            leftIndex = usedChar.get(character) + 1;
        } 

        usedChar.put(character, i);
        max = Math.max(max, ((i-leftIndex) + 1));
    }

    return max;
}

}
