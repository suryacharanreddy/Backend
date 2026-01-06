interface FIOne{
    public abstract int get();
} 
class FIImp implements FIOne{
    public int get(){
        return 100;
    }
    public static void main(String[]args){
        FIImp fi=new FIImp();
        System.out.println(fi.get());
    }
}
