package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int cars, Model model) {
        List<Car> list = CarService.getCars(cars);
        model.addAttribute("list", list);
        return "car/car";
    }
}
