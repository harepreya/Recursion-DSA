public class SubSeq {
    public static void main(String[] args) {
        subSeque("","abc");
    }

    static void subSeque(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeque(p+ch, up.substring(1));
        subSeque(p, up.substring(1));
    }
}
