class Student{
    String name ;
    private int age;
    double per;
public Student(){ //default constructor
    }
    public Student(String name,int age,double per){
        this.name = name;
        this.age = age ;
        this.per =per;
    }
    void Print(){
        System.out.println(this.name +" "+this.age+" "+this.per);
    }
    void setage(int age){
        this.age = age ;
    }
    int getage(){
        return age;
    }
}
public class idk {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ritul";
        s1.setage(24) ;
        s1.per = 100.0;
        s1.Print();

        Student s2 = new Student("Manish",22,91.0);
        s2.Print();

        System.out.println(s1.getage());
        System.out.println(s1.name);
    }
}