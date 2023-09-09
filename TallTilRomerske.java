public class TallTilRomerske{

    public static void main(String[] args) {
        System.out.println(intToRoman(999999));
    }

    public static String intToRoman(int num) {

        String output = "";
        int rest = num;
        int alleTall[] = {  1,   4,    5,   9,   10,   40,  50,   90,  100, 400,   500, 900,  1000, 100000};
        String[] strArr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD",  "D", "CM", "M", "C"};
        int antallSym = strArr.length;

        while(rest > 0){
            for(int i = antallSym - 1; i >= 0; i--){
                if(rest >= alleTall[i]){
                    output = output + strArr[i];
                    rest = rest - alleTall[i];
                    break;
                }
            }
        }

        return output;
    }
    
}

