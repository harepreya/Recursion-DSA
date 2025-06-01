import java.util.*;

public class SubSetDup2 {
    public static void main(String[] args) {
        int arr[] = { 1,2,1,2};
        List<List<Integer>> ans = subsetsWithDup(arr);
        for (List<Integer> list : ans) {
            System.out.print(list + " ");
        }

    }
        static List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);

            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());

            int s = 0;
            int e = 0;

            for (int i = 0; i < nums.length; i++) {
                List<List<Integer>> mid = new ArrayList<>();

                if (i > 0 && nums[i] == nums[i - 1]) {
                    s = e;
                }
                else {
                    s = 0;
                }

                e = outer.size();

                for (int j = s; j < e; j++) {
                    List<Integer> inter = outer.get(j);
                    inter = new ArrayList<>(inter);
                    inter.add(nums[i]);
                    mid.add(inter);
                }

                outer.addAll(mid);
            }

            return outer;
        }
    }

