package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;

import br.tec.orz.camel.chw.components.MyCurrencyExchangeProcessor;
import br.tec.orz.camel.chw.model.CurrencyExchange;

//@Component
public class BeanProcessorRoute extends RouteBuilder{
	
	@Autowired
	private MyCurrencyExchangeProcessor myCurrencyExchangeProcessor;
	
	@Override
	public void configure() throws Exception {
		from("activemq:json-file-activemq-queue")
		.unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
		.bean(myCurrencyExchangeProcessor)
		.to("log:receive-message-from-activemq");
	}

}
