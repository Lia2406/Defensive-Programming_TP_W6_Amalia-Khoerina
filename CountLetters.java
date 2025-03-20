// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the frequency of
// each letter in that word.
//
// ****************************************************************
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] letterCount = new int[26];
        String word;
        char letter;
        int ascii;//urutan huruf

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        word = scan.nextLine().toLowerCase();

        // Count frequency of each letter in word
        for (int i = 0; i < word.length(); i++) {
            try {
                letter = word.charAt(i);//cek apakah huruf atau bukn
                if (letter >= 'a' && letter <= 'z') {
                    ascii = (int) letter - 97;
                    letterCount[ascii]++;
                } else {
                    throw new IllegalArgumentException("Karakter '" + letter + "' bukan huruf");
                }
            } catch (IllegalArgumentException e) { //untuk membedakan errornya agar mudah
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Print results
        System.out.println();
        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] > 0) {
                System.out.println("Huruf " + (char) (i + 97) + ": " + letterCount[i] + " kali");
            }
        }
        
        scan.close();
    }
}
