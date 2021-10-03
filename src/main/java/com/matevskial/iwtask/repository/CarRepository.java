package com.matevskial.iwtask.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.matevskial.iwtask.api.Car;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CarRepository {

	public List<Car> getAllCars() {
		return new ArrayList<>();
	}
}
