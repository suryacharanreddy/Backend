class Employee extends Object{
    //Object class is a default class and parent class for every class whether you declare it or not.
    public static void main(String []args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        System.out.println(e1.equals(e2));
        System.out.println(e2);
        System.out.println(e1.toString());
    }
}