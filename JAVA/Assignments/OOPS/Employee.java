public class Employee{
    private int empId;
    private String empName;
    private double empSalary;
    Employee(int id,String name,double salary){
        this.empId=id;
        this.empName=name;
        this.empSalary=salary;
    }
    public double getHRA(){
        return empSalary*0.20;
    }
    public double getDA(){
        return empSalary*0.10;
    }
    public double getGrossSalary(){
        return empSalary+getHRA()+getDA();
    }
    public void showDetails(){
        System.out.println("-----salary slip-----");
        System.out.println("Id :"+this.empId);
        System.out.println("Name :"+this.empName);
        System.out.println("Salary :"+this.empSalary);
        System.out.println("HRA (20%) :"+getHRA());
        System.out.println("DA(10%) :"+getDA());
        System.out.println("Gross Salary :"+getGrossSalary());
    }
}