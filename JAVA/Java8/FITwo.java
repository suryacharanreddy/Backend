interface FITwo{
    public abstract int get();
}
class FIImp2 implements FITwo{
    static FITwo fi=()->100;
    public static void main(String[]args){
        System.out.println(fi.get());
    }
}