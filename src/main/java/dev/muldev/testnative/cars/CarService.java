package dev.muldev.testnative.cars;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarService {

    public List<Car> getAllCars(){
        return List.of(new Car(UUID.randomUUID(), "Seat", "Ateca"));
    }
}
