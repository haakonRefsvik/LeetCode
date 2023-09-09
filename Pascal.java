import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal {
    
    public static void main(String[] args){

        int numRows = 14;
        int rowIndex = 0;
        List<Integer> lastList = new ArrayList<>();
        lastList.add(1);
        List<List<Integer>> pascal = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){
            pascal.add(lastList);
            lastList = makeNextList(lastList);
        }
        
        for(List<Integer> l: pascal){
            System.err.println(l);
        }
    }

    static List<Integer> makeNextList(List<Integer> list){
        List<Integer> nextList = new ArrayList<>(list.size()+1);

        for(int i = 0; i < list.size()+1; i++){
            try {
                nextList.add(i, list.get(i - 1) + list.get(i));

            } catch (IndexOutOfBoundsException e) {
                nextList.add(i, 1);
            }
        }

        return nextList;
    }
}
