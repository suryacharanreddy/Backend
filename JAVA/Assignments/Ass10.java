class Employee{
    int eid;
    String ename;
    String gender;
    double esal;
    Employee(int id,String name,String gen,double sal){
        this.eid=id;
        this.ename=name;
        this.gender=gen;
        this.esal=sal;
    }
    public void addBonus(double amount){
        this.esal=this.esal+amount;
    }
    public static void main(String[]args){
        Employee a1=new Employee (101,"Rahul","Male",45000.9);
        System.out.println(a1.eid);
        System.out.println(a1.ename);
        System.out.println(a1.gender);
        System.out.println(a1.esal);
        Employee a2 =new Employee (102,"Sonia","Female",54000.45);
        System.out.println(a2.eid);
        System.out.println(a2.ename);
        System.out.println(a2.gender);
        System.out.println(a2.esal);
        System.out.println("After adding Bonus ");
        a1.addBonus(12000);
        a2.addBonus(50000);
        System.out.println(a1.esal);
        System.out.println(a2.esal);

    }
}