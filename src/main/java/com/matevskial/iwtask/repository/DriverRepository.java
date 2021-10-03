package com.matevskial.iwtask.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.matevskial.iwtask.api.Car;
import com.matevskial.iwtask.api.Driver;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DriverRepository {

	public List<Driver> getAllDrivers() {
		return new ArrayList<>();
	}
}
