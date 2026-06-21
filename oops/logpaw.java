import java.util.Scanner;

public class logpaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base number : ");
        int a = sc.nextInt();
        System.out.print("Enter the power number : ");
        int b = sc.nextInt();
        sc.close();
        if(a==0&&b==0){
            System.out.println("notdefined for given value");
            return;
        }
        System.out.println(a+" raised to power "+b+" is "+paw(a,b));
    }
    public static int paw(int x,int y){
        if(y==0) return 1;
        if(y==1) return x;
        int half = paw(x,y/2);
        if(y%2==0) return half * half;
        else return x*half*half;
    }
    
}
