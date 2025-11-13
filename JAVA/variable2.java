public class variable2{
    static String bank_Name="SBI";
    static String branch_Name="Marathahalli";
    int acc_Id;
    String acc_Name;
    double acc_Balnc;
    public void disp_Data(){
        acc_Id=10002;
        acc_Name="surya";
        System.out.println(acc_Id);
        System.out.println(acc_Name);
    }
    public static void main(String[] args){
    variable2 array1=new variable2();
    array1.disp_Data();
    }
}