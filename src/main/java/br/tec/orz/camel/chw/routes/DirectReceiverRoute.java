package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class DirectReceiverRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("direct:log-file-values")
		.log("${file:name}")
		.log("${file:name.ext}")
		.log("${file:onlyname}")
		.log("${file:path}")
		.log("${file:absolute}")
		.log("${file:absolute.path}");
	}

}


