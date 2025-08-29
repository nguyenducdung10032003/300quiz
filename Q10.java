/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */

import java.util.Scanner;

public class Q10 {
    public static int maxSubArray(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > maxEndingHere + nums[i]){
                maxEndingHere = nums[i];
            }else{
                maxEndingHere = maxEndingHere + nums[i];
            }
            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang muon: ");
        int n = scan.nextInt(); 
        int arr[] = new int[n];
        System.out.print("Nhap mang: ");
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Output: " + maxSubArray(arr));    
    }
}
