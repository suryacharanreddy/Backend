class Employee{
    private double salary;
    public void setSalary(double s){
        salary=s;
    }
    public double getSalary(){
        return salary;
    }
    public void printNetSalary(){
        double netSalary=salary-(salary*0.10);
        System.out.println("Net Salary after 10% tax deduction :"+netSalary);
    }
    public static void main(String[]args){
        Employee obj=new Employee();
        obj.setSalary(50000);
        System.out.println("Salary :"+obj.getSalary());
        obj.printNetSalary();
    }
}