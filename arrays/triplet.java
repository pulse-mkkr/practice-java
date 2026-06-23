import java.util.Scanner;
public class arrnumtrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any n to check pairs : ");
        int n = sc.nextInt();
        sc.close();
        int arr[]={1,2,3,4,5,6,7,8,9},pcount=0;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==n){
                        pcount++;
                        System.out.println(""+arr[i]+" + "+arr[j]+" + "+arr[k]+" = "+n);
                    }
                }
            }  
        }
       System.out.print("total triplets are "+pcount);
    }
}
