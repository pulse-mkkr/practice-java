import java.util.Scanner;
public class greet {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the time you wanna print : " );
    int x = sc.nextInt();
    greeting(x);
    sc.close();
    }
    public static void greeting (int a) {
        for(int i=1;i<=a;i++){
            System.out.println("Good Morning PineApple");
        }
    }
}
