package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Ford", 2021, 2022));
        cars.add(new Car("Volvo", 2017, 2015));
        cars.add(new Car("BMV", 2023, 2024));
        cars.add(new Car("Toyota", 2019, 2025));
        cars.add(new Car("Tesla", 3, 2017));
    }


    public List<Car> getCars(int count) {
        if (count <= 0 || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
