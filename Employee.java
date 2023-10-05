  class Demo{
    private Double Salary;
        public void setSalary(Double Salary){
            this.Salary=Salary;
        }
    
    public void show(){
        System.out.println("Salary="+this.Salary);
    }
    public Demo findMax(Demo emp){
        Demo  max=new Demo();
        max.Salary=Salary>emp.Salary?Salary:emp.Salary;
        return max;
    }
}
    public class Employee{
    public static void main(String args[]){
        Demo emp1=new Demo();
        Demo emp2=new Demo();
        emp1.setSalary(12000.0);
        emp1.show();
        emp2.setSalary(8000.0);
        emp2.show();
        Demo emp3=new Demo();
        emp3=emp2.findMax(emp1);
         emp3.show();

    }

}


