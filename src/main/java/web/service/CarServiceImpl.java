package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.Objects;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCar(Integer count)
    {
        int intCount = Objects.requireNonNullElse(count, 0);
        if (intCount == 0) {
            return carDao.getAllCars();
        }
        return carDao.getAllCars().stream().limit(intCount).toList();
    }
}
