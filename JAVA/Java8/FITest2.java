import java.util.function.Supplier;
class FITest2{
    public abstarct boolean get();

}
class FTest2 implements FITest2{
    public boolean get(){
        return true;
    }
    public static void main(String[]args){ 
        FITest2 s=new FTest2();
        System.out.println(s.get());
    }
}