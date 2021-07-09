package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class SettingCustomExchangeHeadersRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:my-timer?period=10000")
		.setHeader("pHeader", () -> "myValue")
		.log("${messageHistory}");
	}

}
