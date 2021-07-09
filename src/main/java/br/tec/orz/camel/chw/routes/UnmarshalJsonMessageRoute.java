package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

import br.tec.orz.camel.chw.model.CurrencyExchange;

//@Component
public class UnmarshalJsonMessageRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("activemq:json-file-activemq-queue")
		.unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
		.to("log:receive-message-from-activemq");
	}

}
