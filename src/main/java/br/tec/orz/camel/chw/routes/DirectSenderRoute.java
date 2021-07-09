package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DirectSenderRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files/input")
		.to("direct:log-file-values");
	}

}


