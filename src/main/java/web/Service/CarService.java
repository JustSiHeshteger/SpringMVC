package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private static List<Car> cars = Arrays.asList(
            new Car("Tesla", "X", 500),
            new Car("Tesla", "S", 250),
            new Car("Niva", "Urban", 105),
            new Car("Lada", "7", 75),
            new Car("Mersedes", "S", 450));

    public static List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }

        return cars
                .stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
