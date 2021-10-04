package com.matevskial.iwtask.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Car {

	private long id;
	private String manufacturer;
	private String model;
	
}
