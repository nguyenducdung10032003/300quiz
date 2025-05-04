/*
Cho một chuỗi s chỉ chứa các ký tự '(', ')', '{', '}', '[' và ']', hãy xác định xem chuỗi đầu vào có hợp lệ không.

Chuỗi đầu vào hợp lệ nếu:

Các dấu ngoặc mở phải được đóng bằng cùng loại dấu ngoặc.
Các dấu ngoặc mở phải được đóng theo đúng thứ tự.
Mỗi dấu ngoặc đóng có một dấu ngoặc mở tương ứng cùng loại.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true 
Nhac lai ve stack
push(): Day 1 phan tu len dau ngan xep
pop(): Xoa va tra ve phan tu tren cung cua ngan xep
LAST IN - FIRST OUT
*/

import java.util.Scanner;
import java.util.Stack;

public class Q2 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == ']' && top != '[') ||
                            (c == '}' && top != '{')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String string = scanner.nextLine();
        System.out.println("True or False: " + isValid(string));
    }
}
