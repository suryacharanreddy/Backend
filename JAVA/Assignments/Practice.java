class Parent{
    parent (String name){
        
    }
}
class Child extends Parent{
    Child(String name){
        super(name);
    }
    public static void main(String []args){
        Child obj=new Child("Surya");
        System.out.println(obj.name);
    }
}