public class arr {
    public static void main(String[] args) {
        int marks[]={12,24,54,99,45,87,35};
        int fail=0;
        for(int i =0;i<marks.length;i++){
            if(marks[i]<40){ 
                System.out.println("roll no "+i+" has "+marks[i]+" marks.");
                fail++;
            }
        }
        System.out.println("number of failed students are "+fail);
    }
}
