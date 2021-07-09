package br.tec.orz.camel.chw.components;

import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.ExchangeProperties;
import org.apache.camel.Headers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DynamicRouterBean {
	
	private Logger logger = LoggerFactory.getLogger(DynamicRouterBean.class);
	
	public String decideTheNextEndpoint(
			@ExchangeProperties Map<String, String> properties,
			@Headers Map<String, String> headers,
			@Body String body) {
		
		String nextEndpoint = "direct:endpoint1"; 
		logger.info("return next endpoint {}", nextEndpoint);		
		return nextEndpoint;
	}

}
