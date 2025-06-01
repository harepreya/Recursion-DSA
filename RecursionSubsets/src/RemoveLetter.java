import java.util.*;

public class RemoveLetter {
    public static void main(String[] args) {
        //remove(" ","nagshalkj");
        System.out.println(skip("harepreya"));
    }
// 1st approach (withtout returning but using new string ans to store the output
    static void remove(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a')
            remove(p,up.substring(1));
        else
            remove(p+ch, up.substring(1));
    }

    // 2nd approach (using return value withtout new string
    static String skip(String up){
        if(up.isEmpty())
            return " ";
        char ch = up.charAt(0);
        if (ch == 'a')
            return skip(up.substring(1));
        else
            return ch + skip(up.substring(1));
    }

}
