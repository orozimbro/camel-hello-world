package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class ActiveMQReceiverRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("activemq:my-activemq-queue")
		.to("log:receive-message-from-activemq");
	}

}
