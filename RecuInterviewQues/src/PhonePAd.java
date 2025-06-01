import java.util.*;
//Google Question
    public class PhonePAd {
        public static void main(String[] args) {
            int arr[] = {2,3,4};
            //String up = Arrays.toString(arr);
            //System.out.println(up);
            System.out.println(letterCombinations("923"));
        }
        static List<String> letterCombinations(String up) {
                if (up == null || up.isEmpty()) {
                    return new ArrayList<>();
                }
                return pad("", up);
            }
        static List<String> pad(String p, String up) {
                if (up.isEmpty()) {
                    ArrayList<String> str = new ArrayList<>();
                    str.add(p);
                    return str;
                }

                int digit = up.charAt(0) - '0';
                if (digit < 2 || digit > 9) {
                    return new ArrayList<>(); // Return an empty list for invalid input
                }

                List<String> ans = new ArrayList<>();
                String letters = getLettersForDigit(digit);

                for (char ch : letters.toCharArray()) {
                    ans.addAll(pad(p + ch, up.substring(1)));
                }
                return ans;
            }

        static String getLettersForDigit(int digit) {
                switch (digit) {
                    case 2: return "abc";
                    case 3: return "def";
                    case 4: return "ghi";
                    case 5: return "jkl";
                    case 6: return "mno";
                    case 7: return "pqrs";
                    case 8: return "tuv";
                    case 9: return "wxyz";
                    default: return "";
                }
            }
    }


