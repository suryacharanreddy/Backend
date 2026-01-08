//User defined Predicate Functional Interface
interface PredicateOne{
    public abstract boolean test(String ename);

}
class TestOne implements PredicateOne{
    public boolean test(String ename){
        return ename.length()>=5;

    }
    public static void main(String[]args){
        PredicateOne p=new TestOne();
        System.out.println(p.test("Rhaul Gandhi"));
    }
}