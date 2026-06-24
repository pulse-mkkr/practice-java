public class arrpalin {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int brr[]={1,2,3,4,5,4,3,2,1};
        check(arr);
        check(brr);

    }
    public static void check(int ch[]){
        int count=0;
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]!=ch[ch.length-i-1]){
                System.out.println("Given array is not palindrome ");
                count++;
                break;
            }

        }
        if(count==0) System.out.println("Given array is palindrome");
    }
    
}
