package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class TransformWithBeanNameRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:fisrt-timer")
		.bean("getCurrentTimeBean")
		.to("log:first-log");
	}

}


