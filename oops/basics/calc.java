package basics;
import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your equation : ");
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        double b = sc.nextDouble();
        switch (c){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default:System.out.println("invalid input");
        }
        sc.close();
    }
}
