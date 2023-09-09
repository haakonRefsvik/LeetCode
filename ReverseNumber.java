public class ReverseNumber {
    
    public static void main(String[] args){

        long reversert = 0;
        int rest = 0;
        int x = -321;
        int n = 3;

        while (x != 0) {
            rest = x % 10;                         
            reversert = (reversert * 10) + rest;   
            x /= 10;                               
        }       
        
        System.out.println(reversert);
    }
}
