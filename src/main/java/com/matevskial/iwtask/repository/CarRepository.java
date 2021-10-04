package com.matevskial.iwtask.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.matevskial.iwtask.api.Car;
import com.matevskial.iwtask.csvparser.CsvParser;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CarRepository {

	private List<Car> cars;
	
	public CarRepository() throws Exception {
		log.info("Initializing car  data from cvs file");
		cars = new ArrayList<>();
		List<String[]> csvRows = CsvParser.parse("cars.csv");
		for(String[] row : csvRows) {
			if(row.length != 3) {
				continue;
			}
			
			try {
				long id = Long.parseLong(row[0]);
				String manufacturer = row[1];
				String model = row[2];
				cars.add(new Car(id, manufacturer, model));
			} catch (Exception e) {
				continue;
			}
		}
	}
	
	public List<Car> getAllCars() {
		return List.copyOf(cars);
	}
}
