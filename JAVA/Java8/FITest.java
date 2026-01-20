import java.util.function.Supplier;
class FITest{
    public static void main(String[]args){
        Supplier<Boolean> s=()->false;
        System.out.println(s.get());
    }
}