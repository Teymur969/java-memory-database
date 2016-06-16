package car;

import java.util.ArrayList;

public class CarStorage {

    private ArrayList<Car> carStorage;

    public CarStorage() {
        carStorage = new ArrayList<Car>();
    }

    public Car newCar(String manufacturer, String model, Integer year) {
        Car car = new Car();
        car.setManufacturer(manufacturer);
        car.setModel(model);
        car.setYear(year);

        carStorage.add(car);
        return car;
    }

    public Car updateCar(Integer index, Car newCar) {
        carStorage.add(index, newCar);
        return newCar;
    }

    public Car getCar(Integer index) {
        if (count() > 0) {
            return carStorage.get(index);
        } else {
            return null;
        }
    }

    public Integer count() {
        return carStorage.size();
    }

}
