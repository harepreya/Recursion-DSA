import java.util.*;
public class IterativeSubSet {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        List<List<Integer>> ans = subSet(arr);
        for(List<Integer> list: ans){
            System.out.print(list+", ");
        }
    }

    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int n : arr){
            int m = outer.size();
            for(int i=0;i<m;i++){
                List<Integer> inter = new ArrayList<>(outer.get(i));
                inter.add(n);
                outer.add(inter);
            }
        }
        return outer;

    }
}
