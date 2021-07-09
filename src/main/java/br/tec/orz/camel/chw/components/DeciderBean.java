package br.tec.orz.camel.chw.components;

import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.ExchangeProperties;
import org.apache.camel.Headers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DeciderBean {
	
	private Logger logger = LoggerFactory.getLogger(DeciderBean.class);
	
	public boolean isThisConditionMet(
			@Body String body, 
			@Headers Map<String, String> headers,
			@ExchangeProperties Map<String, String> exchangeProperties) {
		
		logger.info(":: DB :: {} {} {}", body, headers, exchangeProperties);
		
		if(body.contains("USD")) {
			return true;
		} else {
			return false;
		}
		
	}

}
