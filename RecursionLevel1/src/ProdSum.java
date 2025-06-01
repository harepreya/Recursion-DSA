public class ProdSum {
    public static void main(String[] args) {
        //factorial
//        int n = fact(5);
//        System.out.println(n);
//      int n = sum(5);
        int n = sumOfDigits(5123);
        System.out.println(n);
    }

    static int fact(int n){ //fact //prod
        if(n<=1)
            return 1;
        return n*fact(n-1);

    }
    static int sum(int n){  //sum
        if(n<=1)
            return 1;
        return n+sum(n-1);

    }
    static int sumOfDigits(int n){ //prod of digit & sum
        if(n==0)
            return 0;
        return (n%10)+sumOfDigits(n/10);
       // * or +
    }
}
