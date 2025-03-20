// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;
        
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        
        while (scanLine.hasNext()) {
            try {
                //pake block try and catch
                //ini mirip kyk if jika value adalah number maka akan ditambahkan dengan value number selanjutnya yang telah di scan
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Skip yang bukan angka
                continue;
            }
        }
        
        System.out.println("The sum of the integers on this line is " + sum);
        
        // Close scanners agar tidak ada memory leak
        scan.close();
        scanLine.close();
    }
}
