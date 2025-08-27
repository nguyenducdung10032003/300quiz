/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 */
import java.util.Scanner;
public class Q6 {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 1: ");
        String input1 = scan.nextLine();
        System.out.print("Input 2: ");
        String input2 = scan.nextLine();
        
        System.out.print("Output: " + isAnagram(input1.toLowerCase(), input2.toLowerCase()));
    }

    // public static boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) return false;

    //     HashMap<Character, Integer> count = new HashMap<>();

    //     for (int i = 0; i < s.length(); i++) {
    //         char c1 = s.charAt(i);
    //         char c2 = t.charAt(i);

    //         count.put(c1, count.getOrDefault(c1, 0) + 1);
    //         count.put(c2, count.getOrDefault(c2, 0) - 1);
    //     }

    //     for (int val : count.values()) {
    //         if (val != 0) return false;
    //     }

    //     return true;
    // }
}
