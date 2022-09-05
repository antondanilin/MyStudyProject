package denis;

public class Ex3 {

    static String test = "Nakab -bakan";

    public static void main(String[] args) {
        System.out.println(isPalindrome(args[0]));

    }

    static boolean isPalindrome(String rawStr) {
        String str = rawStr
                .replaceAll("[^a-zA-z0-9]", "")
                .toLowerCase();

        String str2 = "";
        int len = str.length();


        for (int k = len - 1; k >= 0; k--) {
            char nextChar = str.charAt(k);
            str2 = str2.concat(String.valueOf(nextChar));
        }

        return str.equals(str2);
    }
}
