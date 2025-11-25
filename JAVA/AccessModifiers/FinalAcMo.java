final class FinalAcMo{     //if we declare class as final we cannot inherit the class.
    public void surya(){
        System.out.println("Hello everyone Good morning");
    }
}
class Test extends FinalAcMo{    //we will get error we ant create a child class for final class
    public static void main(String[]args){
        Test obj=new Test();
        obj.surya();
    }
}