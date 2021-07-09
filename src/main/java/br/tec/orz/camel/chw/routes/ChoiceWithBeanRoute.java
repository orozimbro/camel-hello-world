package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import br.tec.orz.camel.chw.components.DeciderBean;

//@Component
public class ChoiceWithBeanRoute extends RouteBuilder{
	
	@Autowired
	private DeciderBean deciderBear;

	@Override
	public void configure() throws Exception {
		from("file:files/input")
		.transform().body(String.class)
		.choice()
			.when(simple("${file:ext} ends with 'xml'"))
				.log("XML File")
			.when(method(deciderBear))
				.log("Not a XML File, But contains USD")
			.otherwise()
				.log("Not a XML File")
		.end()
		.to("file:files/output");
	}

}
