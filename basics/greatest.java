package basics;
import java.util.Scanner;
class greatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number a :");
        double a = sc.nextDouble();
        System.out.print("Enter any number b :");
        double b = sc.nextDouble();
        System.out.print("Enter any number c :");
        double c = sc.nextDouble();
        System.out.print("Enter any number d :");
        double d = sc.nextDouble();
        System.out.print("Greatest number is : "+Math.max(Math.max(a,b),Math.max(c,d)));
        sc.close();
    }
}