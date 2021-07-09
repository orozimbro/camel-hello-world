package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

import br.tec.orz.camel.chw.model.CurrencyExchange;

//@Component
public class UnmarshalXmlMessageRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("activemq:xml-file-activemq-queue")
		.unmarshal().jacksonxml(CurrencyExchange.class)
		.to("log:receive-message-from-activemq");
	}

}
