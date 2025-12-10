public class Product{
    int id;
    String name;
    double price;
    Product( int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Price :"+price);
    }
    public String applyDiscount(double percentage){
        double discount=price-((percentage/100)*price);
        return "Price after discount :"+discount;
    }
    public static void main(String[]args){
        Product p1=new Product(101,"Ball",490);
        p1.displayDetails();
        System.out.println(p1.applyDiscount(25));
        Product p2=new Product(102,"Bat",5850);
        p2.displayDetails();
        System.out.println(p2.applyDiscount(9));
    }

}