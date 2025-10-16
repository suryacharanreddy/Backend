import java.util.Scanner;
public class Small {
    public static void main(String []args){
        Scanner pole=new Scanner(System.in);
        System.out.print("Enter a String :");
        String str=pole.nextLine();
        System.out.println("You entered : "+str);
        pole.close();
    }
    
}
