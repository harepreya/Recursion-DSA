

public class Reverse {
    public static void main(String[] args) {
        int s=helper(1234);
        System.out.println(s);
    }
    //1 way
    static int sum =0;
    static void rev(int n){
        if(n==0)
            return;
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
    }

    //2 way
    static int helper(int n){
        int d = (int)(Math.log10(n))+1;
        return rev2(n,d);
    }
    static int rev2(int n,int d){
        if(n%10 == n)
            return n;
        int rem = n%10;
        return rem*(int)(Math.pow(10,d-1))+rev2(n/10,d-1);
    }
}
