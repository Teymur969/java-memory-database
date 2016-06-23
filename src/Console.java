import car.CarConsole;

import java.util.Objects;

public class Console {

    private static void printHelp() {
        System.out.println("1 - Create Car");
        System.out.println("2 - Update Car");
        System.out.println("3 - Delete Car");
        System.out.println("4 - View Car");
        System.out.println("5 - List Car");
        System.out.println("6 - Clear Cars");
        System.out.println("7 - Add Demo Cars");
        System.out.println("0 - Exit");
    }

    private static String readCommand() {
        System.out.print("Please enter command: ");
        String command = System.console().readLine();

        System.out.println("");

        if (command.equals("0")) {
            System.out.print("Are you sure [y or n]: ");
            String confirm = System.console().readLine();
            if (confirm.equals("y")) {
                System.out.print("Bye!");
            } else {
                command = "100"; // prevent program termination
            }
        } else if (command.equals("1")) {
            CarConsole.newCar();
        } else if (command.equals("2")) {
            CarConsole.updateCar();
        } else if (command.equals("3")){
            CarConsole.deleteCar();
        }
        else if (command.equals("5")) {
            CarConsole.listCars();
        } else {
            command = "100";
        }

        System.out.println("");
        return command;
    }

    public static void main(String[] args) {
        System.out.println("Car Database Application");

        do {
            printHelp();
            System.out.println("");
        } while (!Objects.equals(readCommand(), "0"));
    }
}