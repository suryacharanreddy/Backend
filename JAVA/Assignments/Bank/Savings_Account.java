public class Savings_Account extends Account{
    int acc_Id;
    double acc_Bal;
    double min_Bal=500;
    public Savings_Account(int id,String name,String email,double bal){
        super(name,email);
        this.acc_Id=id;
        this.acc_Bal=bal;
    }
    public void cal_Bal(){
        System.out.println(this.acc_Bal-this.min_Bal);
    }
}