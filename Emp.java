public class Emp 
{
    String name;
    int id;
    double salary;
    
    public Emp(String name,int id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayInfo()
    {
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Salary:"+salary);
    }
    public static void main(String[] args) {
            Emp emp1=new Emp("xyz",101,50000);
            emp1.displayInfo();
    }
}
