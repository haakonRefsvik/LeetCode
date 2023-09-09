public class Palindrom {
    

    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        str1 = str1.toLowerCase();
        System.out.println(str1); 
        System.out.println(erPalindrom(str1)); 
  
    }

    public static boolean erPalindrom(String s){
        float mid = s.length() / 2;

        for(int i = 0; i <= mid; i++){
            int j = s.length() - i - 1;
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
