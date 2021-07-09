package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class LoggingHeaderFromExchangeRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:logging-time?period=10000")
		.log("${messageHistory}")
		.log("${headers.CamelMessageTimestamp}  ${headers.firedTime}");
	}

}


