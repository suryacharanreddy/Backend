interface CalcImp{
    public abstract int add(int a, int b);
}
class CalcImpl2{
    public static void main(String[]args){
        CalcImp ci=(a,b)->a+b;
        System.out.println(ci.add(10,20));
    }
}