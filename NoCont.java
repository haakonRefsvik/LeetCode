public class NoCont {
    
    public static void main(String[] args){

        String s = "pwwkew";
        String sNew = String.valueOf(s.charAt(0));


        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != sNew.charAt(sNew.length()-1)){
                sNew += String.valueOf(s.charAt(i)); 
            }
        }

        System.out.println(sNew);
    }
}
