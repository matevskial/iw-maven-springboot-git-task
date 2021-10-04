package com.matevskial.iwtask.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matevskial.iwtask.api.Driver;
import com.matevskial.iwtask.api.DriverService;
import com.matevskial.iwtask.repository.DriverRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

	private final DriverRepository driverRepository;
	
	@Override
	public List<Driver> getAllDrivers() {
		return driverRepository.getAllDrivers();
	}

}
