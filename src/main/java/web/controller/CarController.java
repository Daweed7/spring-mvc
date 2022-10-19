package web.controller;

import java.util.ArrayList;
import java.util.List;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam("count") Integer count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("blue", "mercedes", 150));
        carList.add(new Car("red", "bmw", 200));
        carList.add(new Car("green", "mazda", 100));
        carList.add(new Car("black", "honda", 150));
        carList.add(new Car("yellow", "kia", 150));
        CarService carService = new CarServiceImpl();
        List<Car> carByCount = carService.getByCount(carList, count);
        model.addAttribute("carList", carByCount);
        return "car";
    }
}
