import java.util.Scanner;

public class apowb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base number : ");
        int a = sc.nextInt();
        System.out.print("Enter the power number : ");
        int b = sc.nextInt();
        int ans = paw(a,b);
        System.out.println(ans);
        sc.close();
    }
    public static int paw(int x,int y){
        if(x==0&&y==0) {System.out.println("invalid");
            return 0;
        }
        if(x==0) return 0;
        if(y==0) return 1;
        int ans = x*paw(x,y-1);
        return ans;
    }
}
