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
    public List<Car> getCars(int count) {
        if (count != 0) {
            List<Car> firstNCarsList = new ArrayList<>();
            long limit = count;
            for (Car car : cars) {
                if (limit-- == 0) break;
                firstNCarsList.add(car);
            }
            return firstNCarsList;
        }
        return cars;
    }
}
