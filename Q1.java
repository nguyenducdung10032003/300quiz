/*Cho một mảng các số nguyên nums và một số nguyên target, trả về các chỉ số của hai số sao cho tổng của chúng bằng target.

Bạn có thể cho rằng mỗi đầu vào sẽ có đúng một giải pháp và bạn không được sử dụng cùng một phần tử hai lần.

Bạn có thể trả về câu trả lời theo bất kỳ thứ tự nào. 
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/

import java.util.Scanner;

public class Q1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("Không tìm thấy cặp số hợp lệ.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap cac gia tri: ");
        String string = scanner.nextLine();
        String[] array = string.trim().split(",");

        int[] nums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }

        System.out.print("Nhap gia tri taget: ");
        int taget = scanner.nextInt();
        try {
            int[] result = twoSum(nums, taget);
            System.out.println("Chỉ số của hai số là: " + result[0] + " và " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
