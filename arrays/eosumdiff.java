public class arrdiffeo {
     public static void main(String[] args) {
        int arr[]={6,3,9,4,2,1,0,7};
        int esum=0,osum=0;
        for(int i =0;i<arr.length;i++){
            if(i%2==0) esum+=arr[i];
            else osum+=arr[i];
        }
        System.out.print(esum +" - "+ osum +" = "+(esum-osum));
    }
    
}
