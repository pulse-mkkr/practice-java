import java.util.Scanner;

/**
 * mat5x5
 */
public class mat5x5 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/students : ");   
        int r = sc.nextInt();
        System.out.print("Enter number of columns/subjects : ");   
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=10;
            }
        }
        sc.close();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }  
}
