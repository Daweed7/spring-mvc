package service;

import java.util.List;
import model.Car;

public interface CarService {
    List<Car> getByCount(List<Car> list, int count);
}
