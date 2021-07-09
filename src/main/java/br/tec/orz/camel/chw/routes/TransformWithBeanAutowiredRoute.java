package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import br.tec.orz.camel.chw.components.GetCurrentTimeBean;

//@Component
public class TransformWithBeanAutowiredRoute extends RouteBuilder{
	
	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;

	@Override
	public void configure() throws Exception {
		from("timer:fisrt-timer")
		.bean(getCurrentTimeBean)
		.to("log:first-log");
	}

}
