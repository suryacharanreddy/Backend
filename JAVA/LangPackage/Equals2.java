class Emp{}
class TestTwo {
    public static void main(String[] args) {
        String s1="Rahul";
        String s2=new String("Rahul");
        String s3=new String("Gandhi");

        Emp e1=new Emp();
        Emp e2=new Emp();
        
        int a=100;
        int b=200;
        int c=100;
        System.out.println(e1.equals(e2));//false 
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//False
        System.out.println(e1==e2);//False
        System.out.println(s1==s2);//False
        //System.out.println(a.equals(b)); //compilation error because equals method is used only for objects not for datatypes
        System.out.println(a==b);// False
    }
}