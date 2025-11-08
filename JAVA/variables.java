class test{
    int a=10;
    int b=20;
    static int c=30;
    public static void main(String [] args){
        test t1=new test();
        test t2=new test();
        System.out.println(t1.a+t2.a);
        t1.a=101;
        System.out.println(t1.a+t2.a);
    }
}