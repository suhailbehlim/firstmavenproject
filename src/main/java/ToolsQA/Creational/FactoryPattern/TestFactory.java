package ToolsQA.Creational.FactoryPattern;


//testing the factory pattern 

public class TestFactory {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Car firstCar = factory.getCar(CarType.SEDAN);
        firstCar.getCardetails();

        Car SecondCar = factory.getCar(CarType.LUXURY);
        SecondCar.getCardetails();
       
    } 
}
