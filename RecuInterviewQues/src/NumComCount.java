public class NumComCount {
    public static void main(String[] args) {
        System.out.println(pad("","9"));
    }
    static int pad(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int c=0;
        int d = up.charAt(0)-'0';

        for(int i = (d-1)*3;i<d*3;i++){
            char ch = (char)('a' + i);
            c = c+ pad(p+ch, up.substring(1));
        }
        return c;
    }

}
