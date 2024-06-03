public class App {
    public static void main(String[] args) throws Exception {        
        String text = "Racecar";
        boolean isPal = Palindrome.isPalindrome(text);
        System.out.println(text + " is a palindrome: " + isPal);

        text = "Hello";
        isPal = Palindrome.isPalindrome(text);
        System.out.println(text + " is a palindrome: " + isPal);
    }
}
