public class Test{
    public static void main(String[]args){
        Savings_Account sa=new Savings_Account(101,"charan","surya@gmail.com",40000);
        System.out.println(sa.acc_Id);
        System.out.println(sa.acc_Name);
        System.out.println(sa.acc_Email);
        
        sa.cal_Bal();
        Current_Account ca=new Current_Account(102,"Surya","charan@gmail.com",125000);
        System.out.println(ca.acc_Id);
        System.out.println(ca.acc_Name);
        System.out.println(ca.acc_Email);
        ca.setMin_Bal(5000.0);
        ca.cal_Bal();
    }
}