package ToolsQA.Creational.FactoryPattern;


//all car type values return
public class CarFactory {
    

    protected Car getCar(CarType type){

        if (type == CarType.SMALL) {
            return new SmallCar();
        } else if (type == CarType.LUXURY) {
            return new LuxuryCar();
        } else if (type == CarType.SEDAN) {
            return new SedanCar();
        } else {
            throw new IllegalArgumentException("Can't return Car, unknown Cartype: " + type);
        }
    }
}