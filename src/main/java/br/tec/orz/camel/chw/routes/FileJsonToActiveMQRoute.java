package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class FileJsonToActiveMQRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("file:files/json")
		.log("${body}")
		.to("activemq:json-file-activemq-queue");
		
	}

}
