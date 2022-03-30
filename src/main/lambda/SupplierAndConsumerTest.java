package main.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author s.melekhin
 * @since 30 март 2022 г.
 */
public class SupplierAndConsumerTest {

    public static List<Car> createThreeCars(Supplier<Car> carSupplier) {
        List<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        List<Car> threeCars = createThreeCars(() -> new Car("Nissan", "silver", 1.6));
        System.out.println(threeCars);
        changeCar(threeCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Upgrade car: " + car);
        });
        System.out.println(threeCars);
    }

}

class Car {

    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}