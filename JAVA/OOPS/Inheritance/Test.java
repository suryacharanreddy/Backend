class Test{
    public static void main(String []args){
        Parent obj=new Parent();
        obj.m1();
        obj.m2();
        Child obj1=new Child();
        obj1.m3();
        obj1.m1();
        obj1.m2();
        Parent c2=new Child();
        c2.m1();
        c2.m2();
    }
}