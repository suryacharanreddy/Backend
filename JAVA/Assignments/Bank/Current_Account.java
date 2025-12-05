public class Current_Account extends Account{
    int acc_Id;
    double acc_Bal;
    private double min_Bal;
    public double getMin_Bal(){
        return min_Bal;
    }
    public void setMin_Bal(double minBal){
        this.min_Bal=minBal;
    }
    public Current_Account(int id,String name,String email,double bal){
        super(name,email);
        this.acc_Id=id;
        this.acc_Bal=bal;
    }
    public void cal_Bal(){
        System.out.println(this.acc_Bal-this.min_Bal);
    }
}