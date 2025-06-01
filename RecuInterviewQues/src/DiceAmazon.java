//time exceeded so DP will save time


public class DiceAmazon {
    public static void main(String[] args) {
        int n = 2, k = 30, target = 5;
        System.out.println(numRollsToTarget(n, k, target));
    }

    public static int numRollsToTarget(int n, int k, int target) {
        return dice(n, k, target);
    }

    static int dice(int diceLeft, int faces, int target) {
        if (target < 0) return 0;
        if (diceLeft == 0) return target == 0 ? 1 : 0;
        int ways = 0;
        for (int i = 1; i <= faces; i++) {
            ways += dice(diceLeft - 1, faces, target - i);
        }
        return ways;
    }
}
