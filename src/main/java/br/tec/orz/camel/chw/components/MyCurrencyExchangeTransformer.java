package br.tec.orz.camel.chw.components;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import br.tec.orz.camel.chw.model.CurrencyExchange;

@Component
public class MyCurrencyExchangeTransformer {
	
	private Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeTransformer.class);
	
	public CurrencyExchange transformMessage(CurrencyExchange currencyExchange) {
		BigDecimal conversionMultiple = currencyExchange.getConversionMultiple();
		logger.info(":: MCET :: [currencyExchange.getConversionMultiple(): {}]", conversionMultiple);
		conversionMultiple = conversionMultiple.multiply(BigDecimal.TEN);
		logger.info(":: MCET :: [currencyExchange.getConversionMultiple(): {}]", conversionMultiple);
		currencyExchange.setConversionMultiple(conversionMultiple);
		return currencyExchange;
	}
	
}