package denis;

public class Ex3 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Was it a cat I saw?"));
    }
    static boolean isPalindrome(String rawStr) {

        String str = rawStr
                .replaceAll("[^a-zA-z0-9]", "")
                .toLowerCase();

        StringBuilder sb = new StringBuilder().append(str);
        StringBuilder sbReversed = new StringBuilder().append(sb).reverse();


        boolean equals = sb.toString().equals(sbReversed.toString());
        return equals;



//        int len = str.length();
//
//        for (int i = 0; i < len / 2 ; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1))
//                return false;
//        }
//
//        return true;
//        for (int k = len - 1; k >= 0; k--) {
//            char nextChar = str.charAt(k);
//            str2 = str2.concat(String.valueOf(nextChar));
//        }
    }
}
