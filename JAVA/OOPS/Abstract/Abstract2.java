abstract class NewBank{
    public abstract double calInterest();
    public String getName(){
        return "Surya";
    }
}
class Account extends Bank{
    public double calInterest(){
        return 0.0;
    }
    public static void main(String[]args){
        Account obj=new Account();
        System.out.println(obj.calInterest());
        System.out.println(obj.getName());
    }
}