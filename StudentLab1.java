
import java.util.Scanner;  // ✅ Import Scanner

public class StudentLab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        System.out.print("Marks in 3 subjects: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;  // ✅ average calculation

        System.out.println("\nName: " + name + "\nRoll: " + roll + "\nTotal: " + total + "\nAverage: " + avg);

        sc.close();
    }
}
