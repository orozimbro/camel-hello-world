package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class SplitFileContentRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files/csv")
		.unmarshal().csv()
		.split(body())
		.to("log:split-files");
	}

}
