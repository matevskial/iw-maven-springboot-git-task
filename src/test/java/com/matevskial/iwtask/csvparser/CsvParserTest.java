package com.matevskial.iwtask.csvparser;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CsvParserTest {
	
	@Test
	void parse_shouldParseTestDataCorrectly() throws Exception {
		List<String[]> result = CsvParser.parse("test.csv");
		assertEquals(result.size(), 3);
		assertEquals(result.get(0).length, 3);
	}

}
