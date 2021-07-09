package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class TimerToLogRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:fisrt-timer?period=10000")
		.to("log:first-log");
	}

}
