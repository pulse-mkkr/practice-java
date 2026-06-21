package basics;
import java.util.Scanner;
public class nump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any nth number : ");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
