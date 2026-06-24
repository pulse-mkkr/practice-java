import java.util.Scanner;
public class arrrotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any n :");
        int n = sc.nextInt();
        sc.close();
        int arr[]={1,2,3,4,5,6,7,8,9};
        int al=arr.length,k=n%al;
        int ans[]=new int[al];
        if(k==0){
            System.out.println("remains same");
            return;
        }
        for(int i=0;i<al-k;i++){
            ans[i]=arr[k+i];
        }
        for(int i=0;i<k;i++){
            ans[al-k+i]=arr[i];
        }
        for(int i=0;i<al;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
