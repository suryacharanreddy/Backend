class Order{
    String orderStatus;
    public void setDetails( String status){
        this.orderStatus=status;
    }
    public String getDetails(){
        return this.orderStatus;
    }
}
class Demo{
    public static void main(String[]args){
        Order obj=new Order();
        obj.setDetails("Delivered");
        System.out.println(obj.getDetails());
    }
}