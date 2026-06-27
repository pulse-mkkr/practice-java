 import java.util.Scanner;
 public class matrectsum {
   
    public static void main(String[] args) {
        int a[][]=new int[6][6];
        int num=1,l1,r1,l2,r2;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=num;
                num++;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting coordinates l1 and r1 respectively : ");
        l1=sc.nextInt();
        r1=sc.nextInt();
        System.out.print("Enter ending coordinates l2 and r2 respectively : ");
        l2=sc.nextInt();
        r2=sc.nextInt();
        sc.close();
        int sum =0;
        for(int i =l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=a[i][j];
            }
        }
        System.out.println("Sum for given coordinates are "+sum);
    }
}
