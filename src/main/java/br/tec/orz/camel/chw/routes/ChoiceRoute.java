package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class ChoiceRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files/input")
		.transform().body(String.class)
		.choice()
			.when(simple("${file:ext} ends with 'xml'"))
				.log("XML File")
			.when(simple("${body} contains 'USD'"))
				.log("Not a XML File, But contains USD")
			.otherwise()
				.log("Not a XML File")
		.end()
		.to("file:files/output");
	}

}
