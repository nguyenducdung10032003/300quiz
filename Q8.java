/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 */
import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    public static int binarySearch(int a[], int x){
        int left = 0;
        int right = a.length - 1;

        for(int i = left; i < right; i++){
            int mid = (left + right)/2;
            if(a[mid] == x){
                return mid;
            }else if(a[mid] > x){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử mảng: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.print("Nhập các phần tử mảng: ");
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Nhập phần tử muốn tìm: ");
        int value = scan.nextInt();
        System.out.print("Output: " + binarySearch(arr,value));
    }
}
