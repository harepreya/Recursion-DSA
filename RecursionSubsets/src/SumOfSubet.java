public class SumOfSubet {
        public static void main(String[] args) {
            char str[] = {'A','B','C'};
            char res[] = new char[6];
            res[0]=str[0];
            fun(str,res,1,1,str.length);
        }
        public static void fun(char str[], char res[], int i, int j, int n) {
            if (i == n) {
                res[j] = '\0';
                System.out.println(res);
                return;
            }
            res[j] = str[i];
            fun(str, res, i + 1, j + 1, n);
            res[j] = ' ';
            res[j + 1] = str[i];
            fun(str, res, i + 1, j + 2, n);
        }
}
