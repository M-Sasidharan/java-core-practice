package basics;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        String word = "Madam";
        System.out.println("Is Palindrome: " + isPalindrome(word));
    }
}
