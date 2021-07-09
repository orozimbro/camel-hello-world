package br.tec.orz.camel.chw.components;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class GetCurrentTimeOrDateBean {
	
	public String getCurrentTime() {
		return "Time now is " + LocalDateTime.now();
	}
	
	public String getCurrentDate() {
		return "Date now is " + LocalDate.now();
	}
	
}