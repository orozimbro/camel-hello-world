package br.tec.orz.camel.chw.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import br.tec.orz.camel.chw.model.CurrencyExchange;

@Component
public class MyCurrencyExchangeProcessor {
	
	private Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);
	
	public void processMessage(CurrencyExchange currencyExchange) {
		logger.info("[currencyExchange.getConversionMultiple(): {}]", currencyExchange.getConversionMultiple());
	}
	
}