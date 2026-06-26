public class arrmissingele {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9,10};
        int sum=0;
        int n = 10;//for total element given 
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int tsum=(n*(n+1))/2;
        int ans = tsum-sum;
        System.out.println("missing element is "+ans);

    }
    
}
