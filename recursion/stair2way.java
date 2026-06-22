import java.util.Scanner;

public class stairway {
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
        if(x==1) return 1;
        if(x==2) return 2;
        return stair(x-1) + stair(x-2);
        
    }
}
