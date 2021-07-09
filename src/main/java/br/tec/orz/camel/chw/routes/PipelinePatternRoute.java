package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class PipelinePatternRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:pipeline?period=10000")
		.pipeline()
		.to("log:pipeline");
	}

}
