import java.util.*;

public class StockPrices {
    
    public static void main(String[] args){

        int[] prices = {3,2,6,5,0,3};
        HashMap<Integer, ArrayList<Integer>> pricesMap = new HashMap<>();

        for(int i = 0; i < prices.length; i++){
            if(pricesMap.containsKey(prices[i])){
                pricesMap.get(prices[i]).add(i);
                continue;
            }

            ArrayList<Integer> l = new ArrayList<>();
            l.add(i);
            pricesMap.put(prices[i], l);
        }

        int[] c = prices.clone();
        Arrays.sort(c);
        int min = c[0];
        int max = c[c.length-1];

        int maxProfit = 0;

        for(int minI = 0; minI < c.length; minI++){
            for(int maxI = c.length - 1; maxI > minI; maxI--){
                for(int n: (pricesMap.get(c[minI]))){
                    for(int x: (pricesMap.get(c[maxI]))){
                        if(x > n){
                            System.out.println(x +" "+ n);
                        }
                    }                   
                }
            }
        }

        System.out.println(Arrays.toString(c));

    }
}
