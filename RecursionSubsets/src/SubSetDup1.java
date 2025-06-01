import java.util.*;

public class SubSetDup1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2};
        List<List<Integer>> ans = subSetDup(arr);
        for (List<Integer> list : ans) {
            System.out.print(list + " ");
        }
    }

    static List<List<Integer>> subSetDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                s = e + 1;
            }
            e = outer.size()-1;
            int n = outer.size();
            for (int j = s; j < n; j++) {
                List<Integer> inter = new ArrayList<>(outer.get(j));
                inter.add(arr[i]);
                outer.add(inter);
            }
        }
        return outer;

    }
}
