public class SavingAcc extends Account{
    
    int acc_Id;
    double acc_Bal;
    double min_Bal=500;
    public SavingAcc(int id,String name,String email,double amount){
        super(name,email);
        this.acc_Id=id;
        this.acc_Bal=amount;
    }
    public double cal_Bal(){
        return acc_Bal-min_Bal;
    }
}