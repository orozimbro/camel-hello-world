package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

import br.tec.orz.camel.chw.processor.SimpleLoggingProcessor;

//@Component
public class ProcessingRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:fisrt-timer")
		.transform().constant("My constant message")
		.process(new SimpleLoggingProcessor())
		.to("log:first-log");
	}

}


