package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class KafkaReceiverRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("kafka:jsonFileKafkaTopic")
		.to("log:receive-message-from-kafka");
	}

}
