import java.util.Scanner;

public class stair3way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth stair number : ");
        int n = sc.nextInt();
        sc.close();
        if(n<=0){
            System.out.println("invalid input");
            return;
        }
        int ans = stair(n);
        System.out.println("There are "+ans+" ways to reach "+n+"th stair");
    }
    public static int stair(int x){
       if(x==1||x==2) return x;
       if(x==3) return 4;
       return stair(x-1)+stair(x-2)+stair(x-3);
    }
    
}
