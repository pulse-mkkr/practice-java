import java.util.Scanner;

public class maze2para {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Total no of ways to reach final are "+maze(m,n));
    }
    public static int maze(int fr,int fc){
        if(fr==1&&fc==1) return 1;
        if(fr<0||fc<0) return 0;
        return maze(fr-1,fc)+maze(fr, fc-1);
    }
}
