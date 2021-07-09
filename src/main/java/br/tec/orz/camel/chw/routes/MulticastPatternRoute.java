package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class MulticastPatternRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:timer-multicast?period=10000")
		.multicast()
		.to("log:log-multicast1", "log:log-multicast2", "log:log-multicast3");
	}

}
