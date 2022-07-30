package com.Suresh.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate restTeamplate() {
		return new RestTemplate();
	}
	
	@Bean
	public Sampler sampleObj() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
