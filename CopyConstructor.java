class Student{
    private int roll ,sem;
    public Student(){
       this. roll=0;
       this. sem=0;
    }
    public Student(int a,int b){
        this.roll=a;
        this.sem=b;
    }
    public Student(Student obj){
        this.roll=obj.roll;
        this.sem=obj.sem;
    }public void display(){
        System.out.println("Roll="+this.roll);
        System.out.println("Sem="+this.sem);
    }
}
public class CopyConstructor{
    public static void main(String arg[]){
        Student s1=new Student();
        s1.display();
        Student s2=new Student(34,2);
        s2.display();
        Student s3=new Student(s2);
        s3.display();
    

    }
}


