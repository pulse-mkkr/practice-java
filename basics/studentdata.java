import java.util.Scanner;
public class matstdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/students : ");   
        int r = sc.nextInt();
        System.out.print("Enter number of columns/subjects : ");   
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter marks of student "+(i+1)+" ");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<arr.length;i++){
            System.out.print("Roll no. "+(i+1)+" has ");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }  
}
