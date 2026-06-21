package basics;
import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int x = sc.nextInt();
        int i = x-1;
        while(i>0){
            if(x%i==0){ System.out.print(i+" ");
                
            }
            i--;
        }
        sc.close();
    }
}
