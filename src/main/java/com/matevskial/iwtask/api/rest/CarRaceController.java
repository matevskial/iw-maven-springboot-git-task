package com.matevskial.iwtask.api.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matevskial.iwtask.api.Car;
import com.matevskial.iwtask.api.CarService;
import com.matevskial.iwtask.api.Driver;
import com.matevskial.iwtask.api.DriverService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CarRaceController {

	private final CarService carService;
	private final DriverService driverService;
	
	@GetMapping("/cars")
	public List<Car> getAllCars() {
		return carService.getAllCars();
	}
	
	@GetMapping("/drivers")
	public List<Driver> getAllDrivers() {
		return driverService.getAllDrivers();
	}
}
