package dev.muldev.testnative.cars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CarController.CAR_URL)
@AllArgsConstructor
public class CarController {

    public static final String CAR_URL = "/cars";

    private final CarService carService;

    @GetMapping
    public List<Car> getCars(){
        return carService.getAllCars();
    }

}
