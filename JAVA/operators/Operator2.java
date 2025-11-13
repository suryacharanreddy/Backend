public class Operator2{
    public static void data1(){
        int a=10;
        int b=a++;//post increment 
        System.out.println(a);
        System.out.println(b);
    }
    public static void data2(){
        int d=10;
        int c=++d;// pre increment

        System.out.println(d);
        System.out.println(c);
    }
    public static void main(String[] args){
        data1();
        data2();
    }
}