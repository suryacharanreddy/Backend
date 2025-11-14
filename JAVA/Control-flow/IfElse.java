public class IfElse{
    public static void salary(){
        int esal=45000;
        if(esal>=35000){
            System.out.println("Eligible for Tax");
        }
        else{
            System.out.println("Not Eligible for Tax");
        }
    }
    public static void even(){
        int num=34;
        if(num%2==0){
            System.out.println("The number is even number");
        }
        else{
            System.out.println("The number is odd number");
        }
    }
    public static void digits(){
        int num=222;
        if(num>=100 && num<=999){
            System.out.println("The number is 3-digit number");
        }
        else{
            System.out.println("The number is not a 3-digit number");
        }
    }
    public static void strLength(){
        String name="surya";
        if (name.length()>=5){
            System.out.println("It is a proper user name");
        }
        else{
            System.out.println("Not a proper user name");
        }
    }
    public static void main(String[]args){
        salary();
        even();
        digits();
        strLength();
    }
}