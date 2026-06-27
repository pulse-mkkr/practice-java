public class matmax1inrow{
   
    public static void main(String[] args) {
        int a [][]={{1,1,1,1,1},{0,0,1,1,1},{0,0,0,0,1},{1,1,1,1,0}};
        int sum=Integer.MIN_VALUE,rn=-1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++){
            int rsum=0;
            for(int j=0;j<a[i].length;j++){
                rsum+=a[i][j];
            }
            if(sum<rsum){
                sum=rsum;
                rn=i;
            }
        }
        System.out.print("Row number "+(rn+1)+" has the maximum sum which is "+sum);
        
    }
}
