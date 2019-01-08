package com.example.CarApplication.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarApplication.domain.Car;
import com.example.CarApplication.domain.CarRepository;

@RestController
public class CarController { 
	 @Autowired
     private CarRepository repository;
//hhh
    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
    	 return repository.findAll();
    }
}

