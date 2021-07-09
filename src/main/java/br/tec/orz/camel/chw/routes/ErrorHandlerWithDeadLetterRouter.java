package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class ErrorHandlerWithDeadLetterRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		errorHandler(deadLetterChannel("activemq:dead-letter-queue"));
		
		from("timer:error-handler?period=10000")
		.log("${body}")
		.to("kafka:jsonFileKafkaTopic");
		
	}

}
