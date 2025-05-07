public class Emp 
{
    String name;
    int id;
    double salary;
    int age;
    public Emp(String name,int id,double salary,int age)

    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.age=age;
    }
    public void displayInfo()
    {
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) {
            Emp emp1=new Emp("xyz",101,50000,25);
            emp1.displayInfo();
    }
}
