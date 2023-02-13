package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService{
    private static List<Car> listCars;

    {
        listCars = new ArrayList<>();
        listCars.add(new Car("Lada", "White", 150));
        listCars.add(new Car("KIA", "Green", 200));
        listCars.add(new Car("Toyota", "Yellow", 230));
        listCars.add(new Car("BMW", "Black", 280));
    }

    @Override
    public List<Car> lisrCars() {
        return listCars;
    }

    @Override
    public List<Car> getCars(int count) {
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
