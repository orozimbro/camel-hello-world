package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class TransformWithConstantRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:fisrt-timer")
		.transform().constant("My constant message")
		.to("log:first-log");
	}

}
