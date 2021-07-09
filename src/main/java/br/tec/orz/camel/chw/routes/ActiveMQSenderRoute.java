package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class ActiveMQSenderRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		from("timer:active-mq-timer?period=10000")
		.transform().constant("My message for ActiveMQ")
		.to("activemq:my-activemq-queue")
		.log("${body}");
	}

}
