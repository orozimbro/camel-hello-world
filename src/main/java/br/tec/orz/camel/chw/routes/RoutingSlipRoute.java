package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class RoutingSlipRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		String routingSlip = "direct:endpoint1,direct:endpoint2";
		//String routingSlip = "direct:endpoint1,direct:endpoint2,direct:endpoint3";
		
		from("timer:routing-slip?period=10000")
		.transform().constant("My message hardcoded.")
		.routingSlip(simple(routingSlip));
		
		//-----------------------------------
		
		from("direct:endpoint1")
		.to("log:direct-endpoint1");
		
		from("direct:endpoint2")
		.to("log:direct-endpoint2");
		
		from("direct:endpoint3")
		.to("log:direct-endpoint3");
	}

}
