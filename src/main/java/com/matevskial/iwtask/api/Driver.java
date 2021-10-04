package com.matevskial.iwtask.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Driver {

	private long id;
	private String firstName;
	private String lastName;
	private boolean active;
	
}
