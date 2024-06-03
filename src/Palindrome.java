public class Palindrome {

    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            char frontChar = str.charAt(i);
            char backChar = str.charAt(len - 1 - i);
            if (Character.toLowerCase(frontChar) != Character.toLowerCase(backChar)) {
                return false;
            }
        }
        return true;
    }
}
