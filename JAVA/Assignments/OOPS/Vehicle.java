abstract class Vehicle{
    abstract void fuelType();
}
class Bike{
    public void fuelType(){
        System.out.println("Fule type of Bike is Petrol");
    }
}
class Car{
    public void fuelType(){
        System.out.println("Fuel type of car is Disel");
    }
}
class Test{
    public static void main(String[]args){
        Bike b1=new Bike();
        b1.fuelType();
        Car c1=new Car();
        c1.fuelType();
    }
}