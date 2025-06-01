//remove occurrences of a substring
 class RemoveSubstring {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("babcdefabc","abc"));
    }
    static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            System.out.println(s.indexOf((part)));
           // s = s.replaceFirst(part, "");
        }
        return s;
    }
}