package _2;
/*
Worker
    name:String
    birthDate:String
    endDate:String
    ----------------
    int getAge()
    double collectPay()                           -----------> SalariedEmployee
    terminate(String endDate)                    |               annualSalary:double
        |                                        |               isRetired:boolean
Employee                                         |               ___________________
    employeeId: long            <----------------|               retire()
    hireDate:String                              |
    ---------------                              ------------> HourlyEmployee
                                                                  hourlyPayRate: double
                                                                  getDoublePay()
 */
public class D_Inheritance_Challenge
{
    public static void main(String[] args) {
        Employee tim = new Employee("Tim","11/11/1985","01/01/2020");
        System.out.println(tim);
        System.out.println("Age = "+tim.getAge());
        System.out.println("Pay = "+tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990","03/03/2020",35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $"+joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $"+joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970","03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $"+mary.collectPay());
        System.out.println("Mary's Holiday Pay = $"+mary.getDoublePay());
    }
}
class Worker
{
    private String name,birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge()
    {
        int currentYear = 2025,birthYear = Integer.parseInt(birthDate.substring(6));//MM/DD/YYYY
        return currentYear-birthYear;
    }
    public double collectPay()
    {
        return 0.0;
    }
    public void terminate(String endDate)
    {
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
class Employee extends Worker
{
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;

    public Employee(String name,String birthDate, String hireDate) {
        super(name,birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
class SalariedEmployee extends Employee
{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    public double collectPay()
    {
        double paycheck = annualSalary/26;
        double adjustedPay = (isRetired)?0.9*paycheck:paycheck;
        return (int) adjustedPay;
    }
    public void retire()
    {
        terminate("12/12/2025");
        isRetired = true;
    }
}
class HourlyEmployee extends Employee
{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate,double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double collectPay()
    {
        return 40*hourlyPayRate;
    }
    public double getDoublePay()
    {
        return 2*collectPay();
    }
}
/*
Making the Call
Joe                                 Object                                                            Mary
a SalariedEmployee                  toString()                                                  An HourlyEmployee

getAge()                            Worker                   <--------------------------------------getAge()
                                     getAge,collectPay
                                     @Override toString()
toString()                          Employee                 <--------------------------------------toString()
                                     @Override toString()
                                     getJobReview
collectPay()______                                                                          ------collectPay()
                 |                  SalariedEmployee          HourlyEmployee               |
                 --------------->    @Override collectPay      @Override collectPay   <----
retire()_________|                                             getDoublePay                |_______retire()

Each method call,made on these objects,points to the code that will actually be executed.
When joe or mary call getAge(),the method's implementation is on Worker,and not overridden by any other class, so the
getAge method on Worker is executed.
When joe or mary call toString(),this method has been overridden twice,first by Worker,and then by Employee.But it wasn't
overridden by either SalariedEmployee,so the method from the Employee class is the on that's used.
Looking at the collectPay method,this method was overridden by both SalariedEmployee and HourlyEmployee.
Joe will execute the method on SalariedEmployee.and mary will execute the one on HourlyEmployee.
SalariedEmployee has a method,retire that's not overridden,meaning it's only on that class,it's a method specific to
SalariedEmployee.
HourlyEmployee has its own method,getDoublePay,which wouldn't apply to a SalariedEmployee,so we declared it on this class,
and not in any super class.
 */