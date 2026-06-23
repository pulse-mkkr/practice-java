import java.util.Scanner;
public class arrnumpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any n to check pairs : ");
        int n = sc.nextInt();
        sc.close();
        int arr[]={1,2,3,4,5,6,7,8,9},pcount=0;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n) {
                    System.out.println(arr[i]+" + "+arr[j]+" = "+n );
                    pcount++;
                }
            }  
        }
       System.out.print("total pairs are "+pcount);
    }
}
