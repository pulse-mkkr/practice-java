public class arruni {
    public static void main(String[] args) {
        int arr[]={1,7,2,6,3,5,4,5,3,6,2,1,7};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(arr[i]+" is the unique number ");
                break;
            }
        }
    }   
}
