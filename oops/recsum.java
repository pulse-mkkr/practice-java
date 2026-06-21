import java.util.Scanner;
public class recsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any n : ");
        int n = sc.nextInt();
        int ans = summing(n,0);
        System.out.println(ans);
        sc.close();
    }
    public static int summing(int x,int y){
        if(x==1) return x+y;
        return summing(x-1,x+y);

    }
}
