/*
Bạn được cung cấp một mảng priceschứa prices[i]giá của một cổ phiếu nhất định trong ngày.ith

Bạn muốn tối đa hóa lợi nhuận bằng cách chọn một ngày duy nhất để mua một cổ phiếu và chọn một ngày khác trong tương lai để bán cổ phiếu đó.

Trả về lợi nhuận tối đa bạn có thể đạt được từ giao dịch này . Nếu bạn không thể đạt được bất kỳ lợi nhuận nào, hãy trả về 0.

 

Ví dụ 1:

Đầu vào: giá = [7,1,5,3,6,4]
 Đầu ra: 5
 Giải thích: Mua vào ngày 2 (giá = 1) và bán vào ngày 5 (giá = 6), lợi nhuận = 6-1 = 5.
Lưu ý rằng việc mua vào ngày 2 và bán vào ngày 1 là không được phép vì bạn phải mua trước khi bán.
Ví dụ 2:

Đầu vào: giá = [7,6,4,3,1]
 Đầu ra: 0
 Giải thích: Trong trường hợp này, không có giao dịch nào được thực hiện và lợi nhuận tối đa = 0.
 */

import java.util.Scanner;

public class Q4 {
    public static int maxProfit(int[] prices) {
        int priceMin = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < priceMin) {
                priceMin = price;
            } else if (price - priceMin > maxProfit) {
                maxProfit = price - priceMin;
            } else if (price - priceMin <= maxProfit) {
                return maxProfit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap price (cách nhau bằng dấu cách): ");
        String input = scanner.nextLine();
        String[] parts = input.trim().split("\\s+");
        int[] prices = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            prices[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Max Profit: " + maxProfit(prices));
    }
}
