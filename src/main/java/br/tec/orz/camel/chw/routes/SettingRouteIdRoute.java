package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class SettingRouteIdRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:first-timer?period=10000")
		.routeId("timer-to-log")
		.to("log:first-log");
	}

}
