//method overriding in inheritance
class Parent{
    public void m1(){
        System.out.println("parent class - m1 method");
    }
    public void m2(){
        System.out.println("parent class - m2 method");
    }
}
class Child extends Parent{
    public void m1(){
        System.out.println("Overrided method in child class - from parent class");
    }
    public void m3(){
        System.out.println("child class - m3 method");
    }
    public static void main(String[]args){
        Parent one=new Parent();
        one.m1();
        one.m2();
        System.out.println("==========================");
        Child two=new Child();
        two.m1();
        two.m2();
        two.m3();
        System.out.println("==========================");
        Parent three=new Child();
        super.three.m1();
        three.m2();
        //three.m3();
    }
}