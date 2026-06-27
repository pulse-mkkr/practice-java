public class mattranspose {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{4,3,2,1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int brr[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){   
                brr[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
