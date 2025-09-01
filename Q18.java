
/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Q18 {
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Đếm tần suất ký tự
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : map.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length += 1;
        }

        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        int result = longestPalindrome(s);
        System.out.println("Độ dài palindrome dài nhất có thể tạo: " + result);
    }
}
