package com.matevskial.iwtask.csvparser;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CsvParser {

	private static final String CSV_COMMA_SEPARATOR = ",";
	
	public static List<String[]> parse(String fileName) throws Exception {
		URL fileUrl = CsvParser.class.getResource("/" + fileName);
		Path filePath = Path.of(fileUrl.toURI());
		List<String> lines = Files.readAllLines(filePath);
		
		List<String[]> result = new ArrayList<>();
		for(String line : lines) {
			if(line.isBlank()) {
				continue;
			}
			
			result.add(line.split(CSV_COMMA_SEPARATOR));
		}
		
		return result;
	}
}
