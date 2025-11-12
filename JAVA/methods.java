import java.util.Scanner;
class solution{
   
    public static void main(String[] args){
        Scanner surya=new Scanner(System.in);
        System.out.print("Enter a value = ");
        int x= surya.nextInt();
        System.out.print("Enter a value = ");
        int y=surya.nextInt();
        System.out.println(charan(x, y));
    }
     public static int charan(int x,int y){
        return x+y;
    }
}