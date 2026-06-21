import java.util.Scanner;
public class maze2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Total no of ways to reach final are "+maze(1,1,m,n));
    }
    public static int maze(int cr,int cc,int fr,int fc){
        if(cr==fr&&cc==fc) return 1;
        int rw=0,dw=0;
        if(cr==fr){
            rw +=maze(cr,cc+1,fr,fc);
        }
        else if(cc==fc){
            dw +=maze(cr+1,cc,fr,fc);
        }
        else {
            rw +=maze(cr,cc+1,fr,fc);
            dw +=maze(cr+1,cc,fr,fc);
        }
        return rw+dw;
    }

}