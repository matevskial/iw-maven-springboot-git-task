package com.matevskial.iwtask.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.matevskial.iwtask.api.Car;
import com.matevskial.iwtask.api.Driver;
import com.matevskial.iwtask.csvparser.CsvParser;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DriverRepository {

	private List<Driver> drivers;
	
	public DriverRepository() throws Exception {
		log.info("Initializing drivers data from cvs file");
		drivers = new ArrayList<>();
		List<String[]> csvRows = CsvParser.parse("drivers.csv");
		for(String[] row : csvRows) {
			if(row.length != 4) {
				continue;
			}
			
			try {
				long id = Long.parseLong(row[0]);
				String firstName = row[1];
				String lastName = row[2];
				boolean active = Boolean.parseBoolean(row[3]);
				drivers.add(new Driver(id, firstName, lastName, active));
			} catch (Exception e) {
				continue;
			}
		}
	}
	
	public List<Driver> getAllDrivers() {
		return List.copyOf(drivers);
	}
}
