public class Operator1{
    short b;
    public static void disp_Data(){
        b=10;
        b=b+1;
        //max(type b, type 1)
        //max(byte, int)
        //final output is int type.
        System.out.println(b);//compile time error
    }
    public static void disp2_Data(){
        b=11;
        b++;//no error 
        System.out.println(b)
    }
    public static void main(String[]args){
        disp_Data();
        disp2_Data();
    }
}