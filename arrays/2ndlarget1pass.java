public class arr2ndlarge {
     public static void main(String[] args) {
        int arr[]={8,8,2,5,4,5,6,7};
        int max = Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2&&arr[i]!=max) max2=arr[i];

        }   
        if(max2==Integer.MIN_VALUE) {
            System.out.println("Second largest doesnt exist");
            return;
        }
        System.out.println(max+" is largest and "+max2+" is second larget");   
    }
    
}
