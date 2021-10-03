package com.matevskial.iwtask.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {

	private long id;
	private String manufacturer;
	private String model; 
}
