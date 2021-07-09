package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class UsingPropertiesOnRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("timer:fisrt-timer?period={{camel-hello-world.timer-period}}")
		.to("{{camel-hello-world.log-endpoint}}");
	}

}
