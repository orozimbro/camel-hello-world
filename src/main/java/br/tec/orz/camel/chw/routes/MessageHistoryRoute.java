package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class MessageHistoryRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files/input")
		.to("log:1")
		.transform().body(String.class)
		.to("log:2")
		.to("file:files/output")
		.log("${messageHistory}");
	}

}
