
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
import java.util.Scanner;

public class Q5 {
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Giữ lại chữ cái và đưa về chữ thường
        String input2 = input.replaceAll("[^A-Za-z]", "").toLowerCase();

        System.out.print("Output: ");

        // Nếu không còn ký tự chữ cái nào thì không phải palindrome
        if (input2.isEmpty()) {
            System.out.print("Not Palindrome");
            return;
        }

        // Đảo chuỗi
        String reversed = new StringBuilder(input2).reverse().toString();

        if (input2.equals(reversed)) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }
}
