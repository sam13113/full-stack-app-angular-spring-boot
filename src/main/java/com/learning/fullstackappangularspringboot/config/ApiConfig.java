package com.learning.fullstackappangularspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * 
 * */
@Configuration
public class ApiConfig {
	/**
	 * Method to create a new deserializer for our API
	 * 
	 * @return {@link ObjectMapper} Object
	 */
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	/**
	 * Method to create a new serializer for our API
	 * 
	 * @return {@link ObjectWriter} Object
	 */
	@Bean
	public ObjectWriter objectWriter(ObjectMapper objectMapper) {
		return objectMapper.writerWithDefaultPrettyPrinter();
	}
}
