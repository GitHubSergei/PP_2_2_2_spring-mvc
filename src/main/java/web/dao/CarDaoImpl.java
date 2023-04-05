package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"Ford","Focus"));
        cars.add(new Car(2,"Volvo","V40"));
        cars.add(new Car(3,"Mercedes","S600"));
        cars.add(new Car(4,"Renault","Megan"));
        cars.add(new Car(5,"Mazda","5"));

    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
