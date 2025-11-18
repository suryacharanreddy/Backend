abstract class AbstractNew{
    public void testOne(){
        int num=25;
        System.out.println(num);
    }
    public static void main(String[] args){
        AbstractNew obj=new AbstractNew(); //error: we cant create obj for abstract class
        obj.testOne(); 
    }
}