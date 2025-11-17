package modifiers;
class Packages{
    public void m1(){
        System.out.println("public class Package2-public method m1");
    }
    void m2(){
        System.out.println("surya charan");        
    }
}
public class Package2{
    public static void main(String[] args){
        Packages obj=new Packages();
        obj.m1();
        obj.m2();
    }
}