package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class SplitComaSeparatedFileRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files/csv")
		.convertBodyTo(String.class)
		.split(body(), ",")
		.to("log:split-values");
	}

}
