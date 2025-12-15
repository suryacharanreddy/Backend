class User{

}
class Emp extends User{

}
class Test{
    public static void main (String[]args){
        User u1=new User();
        Emp e1=new Emp();
        Emp e2=new Emp();
        String s1=new String("Rahul");
        String s2="Rahul";
        String s3=new String("Gandhi");
        String s4="Rahul Gandhi";
        int a=100;
        int b=200;
        System.out.println(u1.equals(s1));
        System.out.println(u1==e1);
    }
}