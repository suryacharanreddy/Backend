import java.util.function.Predicate;
class TestTwo{
    public static void main(String[]args){
        Predicate<String> p=name->name.length()>=5;
        System.out.println(p.test("surya"));
        System.out.println(p.test("charan"));
    }
    
}