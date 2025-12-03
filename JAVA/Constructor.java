class Account{
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    Account(int a,String b,double c){
        this.acc_Id=a;
        this.acc_Name=b;
        this.acc_Bal=c;
        System.out.println("It is a constructor");
    }
    public void openAcc(){
        System.out.println("Account Opened");
    }
    public static void main(String[]args){
        Account a1=new Account(101,"surya",4500.45);
        System.out.println(a1.acc_Id);
        System.out.println(a1.acc_Name);
        System.out.println(a1.acc_Bal); 
        Account a2=new Account(102,"charan",23000.98);
        System.out.println(a2.acc_Id);
        System.out.println(a2.acc_Name); 
        System.out.println(a2.acc_Bal);   
    }
}