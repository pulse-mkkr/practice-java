package basics;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter any number : ");
        x = sc.nextInt();
        if(x==0) System.out.print(x + " is neither odd nor even");
        else if (x%2==0) System.out.print(x+" is even");
        else System.out.print(x+" is odd");
        System.out.print("\ncode is done ");
        sc.close();
    }
}
