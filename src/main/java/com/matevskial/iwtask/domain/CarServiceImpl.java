package com.matevskial.iwtask.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matevskial.iwtask.api.Car;
import com.matevskial.iwtask.api.CarService;
import com.matevskial.iwtask.repository.CarRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
	
	private final CarRepository carRepository;
	
	@Override
	public List<Car> getAllCars() {
		return carRepository.getAllCars();
	}

}
