package pack1;
class B{
    public void m5(){
        System.out.println("Default class - public method");
    }
    public static void main(String[]args){
        A obj=new A();
        obj.m1();
        obj.m2();
        //obj.m3(); we cant access this mehthod because it is private and only used inside the class
        obj.m4();
        B b=new B();
        b.m5();
    }
}