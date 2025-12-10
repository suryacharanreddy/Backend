public class Account extends Bank{
    String acc_Name;
    String acc_Email;
    public Account (String name,String email){
        this.acc_Name=name;
        this.acc_Email=email;
    }
    public double cal_Bal(){
        return 0.0;
    }
}