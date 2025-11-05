import java.util.Scanner;
class phone{
    public static void main(String [] args){
        Scanner i=new Scanner(System.in);
        System.out.print("Enter your PhoneNumber :");
        long a= i.nextLong();
        System.out.print("Enter your AadharNumber :");
        long b= i.nextLong();

        System.out.println("Your PhoneNumber :"+a);
        System.out.println("your AadharNumber :"+b);

    }
}