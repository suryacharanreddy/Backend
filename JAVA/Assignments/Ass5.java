class Ass{
    public void  greet(){
        System.out.println("hello goood morning everyone");
        secret();//calling private method inside public method and executing outside class
    }
    private void secret(){
        System.out.println("Hello goood Afternoon everyone");
    }
}
class Ass5{
    public static void main(String[]args){
        Ass obj=new Ass();
        obj.greet();
    }
}