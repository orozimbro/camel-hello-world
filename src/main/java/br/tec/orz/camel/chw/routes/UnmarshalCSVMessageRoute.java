package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class UnmarshalCSVMessageRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files/csv")
		.unmarshal().csv()
		.to("log:csv-content");
	}

}
