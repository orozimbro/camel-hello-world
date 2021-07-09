package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class FileXmlToActiveMQRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("file:files/xml")
		.log("${body}")
		.to("activemq:xml-file-activemq-queue");
		
	}

}
