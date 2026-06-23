public class arr2large {
     public static void main(String[] args) {
        int arr[]={8,8,2,5,4,5,6,7};
        int max = Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max2&&arr[j]!=max) max2=arr[j];
        }
        if(max2==Integer.MIN_VALUE) {
            System.out.println("second largest does not exist");
            return;
        }
        System.out.println(max+" is largest and "+max2+" is second larget");   
    }
    
}
