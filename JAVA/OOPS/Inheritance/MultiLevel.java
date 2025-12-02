class GrandParent extends Object{
    public String m1(){
       // System.out.println("m1");
       return "Rahul Gandhi";
    }
}
class Parent extends GrandParent{
    public double m2(){
        //System.out.println("m2");
        return 45000.45;
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("m3");
    }
}
class Demo{
    public static void main(String[]args){
        Child c1=new Child();
        System.out.println(c1.m1());
        System.out.println(c1.m2());
        c1.m3();
    }
}