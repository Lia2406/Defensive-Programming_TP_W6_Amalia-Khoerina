// ****************************************************************
// Factorials.java
// Reads integers from the user and prints the factorial of each.
//
// ****************************************************************
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            try {
                System.out.print("Enter an integer: ");
                int val = scan.nextInt();
                
                // Cek angka negatif
                if (val < 0) {
                    throw new IllegalArgumentException("Nilai tidak boleh negatif");
                }
                
                // Cek overflow (lebih dari 16)
                if (val > 16) {
                    throw new IllegalArgumentException("Nilai terlalu besar (maksimal 16)");
                }
                
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
                System.out.print("Another factorial? (y/n) ");
                keepGoing = scan.next();
                
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                scan.nextLine(); // Membersihkan buffer input
            } catch (Exception e) {
                System.out.println("Error tidak terduga: " + e.getMessage());
                scan.nextLine(); // Membersihkan buffer input
            }
        }
        scan.close();
    }
}