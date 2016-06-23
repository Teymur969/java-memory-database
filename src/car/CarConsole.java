package car;

public class CarConsole {

    private static CarStorage carStorage = new CarStorage();

    public static void newCar() {
        System.out.print("Please enter car's manufacturer: ");
        String manufacturer = System.console().readLine();

        System.out.print("Please enter car's model: ");
        String model = System.console().readLine();

        System.out.print("Please enter car's year: ");
        String yearStr = System.console().readLine();
        Integer year = Integer.parseInt(yearStr);

        carStorage.newCar(manufacturer, model, year);
    }

    public static void updateCar() {
        for (int i = 0; i < carStorage.count(); i++) {
            Car car = carStorage.getCar(i);
            Integer currentIndex = i + 1;
            System.out.println(currentIndex + " " + car.getManufacturer() + " " + car.getModel() + " " + car.getYear());
        }

        System.out.println("");
        System.out.print("Please enter car's index: ");
        String indexStr = System.console().readLine();
        Integer index = Integer.parseInt(indexStr);

        System.out.println(carStorage.count());

        if (index > carStorage.count() || index < 1) {
            System.out.println("Wrong car index!");
            return;
        }
        Car selectedCar = carStorage.getCar(index - 1);

        System.out.print("Please enter car's manufacturer [" + selectedCar.getManufacturer() + "]: ");
        String manufacturer = System.console().readLine();
        if (!manufacturer.equals(""))
            selectedCar.setManufacturer(manufacturer);

        System.out.print("Please enter car's model [" + selectedCar.getModel() + "]: ");
        String model = System.console().readLine();
        if (!model.equals(""))
            selectedCar.setModel(model);

        System.out.print("Please enter car's year [" + selectedCar.getYear() + "]: ");
        String yearStr = System.console().readLine();
        if (!yearStr.equals("")) {
            Integer year = Integer.parseInt(yearStr);
            selectedCar.setYear(year);
        }
        //carStorage.updateCar(index, selectedCar);
    }

    public static void listCars() {
        for (int i = 0; i < carStorage.count(); i++) {
            carStorage.getCar(i).print();
            System.out.println("");
        }
    }

    public static void deleteCar() {
    }
}
