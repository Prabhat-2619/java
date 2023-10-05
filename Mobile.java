import java.util.Scanner;

class MobileCompany
{
    private String mobileName;
    private String model;
    private Double price;
    public MobileCompany(String mobileName,String model,Double price)
    {
        this.mobileName=mobileName;
        this.model=model;
        this.price=price;

    }
    public void displayInfo()
    {
        System.out.println("Mobile Name is "+this.mobileName);
        System.out.println("Model Name is "+this.model);
        System.out.println("Price is "+this.price);
    }
    public String getMobileName()
    {
        return this.mobileName;
    }
    public String getModelName()
    {
        return this.model;
    }
}
public class Mobile {
    public static void main(String []args)
    {
        String mname;
        String modelName;
        Scanner obj = new Scanner(System.in);
        MobileCompany comp[] = new MobileCompany[5];
        comp[0] = new MobileCompany("Nokia", "1203", 2300.4);
        comp[1] = new MobileCompany("Samsun", "S5", 24000.4);
        comp[2] = new MobileCompany("Nokia", "1209", 5300.4);
        comp[3] = new MobileCompany("Apple", "I14", 83000.4);
        comp[4] = new MobileCompany("Oppo", "M7", 60000.4);
         
        
    
        System.out.println("------------------------------");
        System.out.println("Enter Mobile Name :");
        mname = obj.next();
        // System.out.println("Enter Model Name:");
        // modelName=obj.next();

        for(MobileCompany cmp :comp)
        {
            String mobile = cmp.getMobileName();
            if(mobile.equals(mname))
            {
                System.out.println(cmp.getModelName());
            }
        //    System.out.println(cmp.getMobileName());
        }

    }
}

