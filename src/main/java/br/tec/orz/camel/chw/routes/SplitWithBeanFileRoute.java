package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import br.tec.orz.camel.chw.components.SplitterComponent;

//@Component
public class SplitWithBeanFileRoute extends RouteBuilder{
	
	@Autowired
	private SplitterComponent splitter;

	@Override
	public void configure() throws Exception {
		from("file:files/csv")
		.convertBodyTo(String.class)
		.split(method(splitter))
		.to("log:split-values");
	}

}
