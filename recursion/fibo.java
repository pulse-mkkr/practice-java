import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the nth number : ");
        int n = sc.nextInt();
        int ans = paw(n);
        System.out.println(ans);
        sc.close();
    }
    public static int paw(int x){
        if(x==1||x==2) return 1;
        return paw(x-1) + paw(x-2);
    }
}
