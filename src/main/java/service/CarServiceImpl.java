package service;

import java.util.List;
import java.util.stream.Collectors;
import model.Car;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getByCount(List<Car> list, int count) {
        return list.stream()
                   .limit(count)
                   .collect(Collectors.toList());
    }
}
