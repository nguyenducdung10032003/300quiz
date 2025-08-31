import java.util.Scanner;

public class Q16 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int count[] = new int[26];
        for (char a : magazine.toCharArray()) {
            count[a - 'a']++;
        }
        for (char a : ransomNote.toCharArray()) {
            if (count[a - 'a'] == 0) {
                return false;
            }
            count[a - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input ransomNote: ");
        String ransomNote = scan.nextLine();
        System.out.print("Input magazine: ");
        String magazine = scan.nextLine();
        System.out.print("Output: " + canConstruct(ransomNote, magazine));
    }
}
