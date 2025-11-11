class star{
    private int x,sq;
    public void getData(){
        x=5;
        sq=x*x;
        System.out.println("value of x :"+x);
        System.out.println("Value of Sq of x :"+sq);
    }
    
}
public class object{
    public static void main(String[] args){
        star obj=new star();
        obj.getData();
    }
}