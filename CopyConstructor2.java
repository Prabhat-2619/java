class Student{
    private double marks;
    public Student(double marks){
        this.marks=marks;
    }
    public Student(Student std1){
        double k=this.marks=std1.marks;
        System.out.println(k);
    }
}
public class CopyConstructor2{
    public static void main(String arg[]){
        Student s1=new Student(300.0);
        Student s2=new Student(s1);
        Student s3=new Student(s2);

    }
}
