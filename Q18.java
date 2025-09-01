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
