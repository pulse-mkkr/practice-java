import java.util.Scanner;

public class heheha {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to create your subject list with marks");

        data();

        sc.close();
    }

    public static void data() {
        String[] sub = new String[5];
        int[] num = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter subject name: ");
            sub[i] = sc.next();

            System.out.print("Enter marks: ");
            num[i] = sc.nextInt();
        }

        System.out.println("\nYour Data:");
        for (int i = 0; i < 5; i++) {
            System.out.println(sub[i] + " = " + num[i]);
        }
    }
}
