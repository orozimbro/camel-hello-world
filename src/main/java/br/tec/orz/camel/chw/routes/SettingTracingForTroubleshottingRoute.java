package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class SettingTracingForTroubleshottingRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		getContext().setTracing(true);
		
		from("timer:fisrt-timer?period={{camel-hello-world.timer-period}}")
		.to("{{camel-hello-world.log-endpoint}}");
	}

}
