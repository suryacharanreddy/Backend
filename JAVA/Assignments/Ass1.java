public class Ass1{
    private String name;
    public void setName(){
        name="surya";
    }
    public void printName(){
        System.out.println(name);
    }
    public static void main (String[] args){
        Ass1 obj=new Ass1();
        obj.setName();
        obj.printName();
        Ass1 obj2=new Ass1();
        obj.name="charan";
        obj.printName();
    }
}
