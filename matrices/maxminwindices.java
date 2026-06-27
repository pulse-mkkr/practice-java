public class matmaxmin {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max = Integer.MIN_VALUE,inmaxi=-1,inmaxj=-1;
        int min = Integer.MAX_VALUE,inmini=-1,inminj=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max =arr[i][j];
                    inmaxi=i;
                    inmaxj=j;
                }    
                if(arr[i][j]<min){
                    min =arr[i][j];
                    inmini=i;
                    inminj=j;
                }      
            }
        }
        System.out.println("Maximum element is "+max+" present at "+inmaxi+","+inmaxj);
        System.out.println("Minimum element is "+min+" present at "+inmini+","+inminj);
    }
}
