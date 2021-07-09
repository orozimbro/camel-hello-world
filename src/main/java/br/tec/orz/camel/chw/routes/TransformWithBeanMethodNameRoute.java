package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import br.tec.orz.camel.chw.components.GetCurrentTimeOrDateBean;

//@Component
public class TransformWithBeanMethodNameRoute extends RouteBuilder{

	@Autowired
	private GetCurrentTimeOrDateBean getCurrentTimeOrDateBean;

	@Override
	public void configure() throws Exception {
		from("timer:fisrt-timer")
		.bean(getCurrentTimeOrDateBean,"getCurrentDate")
		.to("log:first-log")
		.bean(getCurrentTimeOrDateBean,"getCurrentTime")
		.to("log:second-log");
	}

}


