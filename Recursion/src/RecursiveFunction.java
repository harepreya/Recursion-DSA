public class RecursiveFunction {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int n){
        //base condition
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive function call
        //if you are calling a func again & again , you can treat it as a separate call in the stack

        // this is called tail recursion when you have last statement in the recur sion
        print(n+1);
    }
}