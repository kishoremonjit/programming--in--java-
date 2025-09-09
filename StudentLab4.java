import java.util.Scanner;

class StudentLab4 {   // not public, only one public class per file
    String name;
    int id, marks;

    void input(Scanner sc) {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("\nName: " + name + "\nID: " + id + "\nMarks: " + marks);
    }
}

class StudentLab4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLab4 s = new StudentLab4(); // ✅ class name corrected
        s.input(sc);
        s.display();
        sc.close();
    }
}
