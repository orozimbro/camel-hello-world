package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import br.tec.orz.camel.chw.components.DynamicRouterBean;

// CAUTION: running an endpoint call in each millisecond.
//@Component
public class DynamicRouterPatternRoute extends RouteBuilder{
	
	@Autowired
	private DynamicRouterBean dynamicRouterBean;

	@Override
	public void configure() throws Exception {
		
		from("timer:routing-slip?period=10000")
		.transform().constant("My message hardcoded.")
		.dynamicRouter(method(dynamicRouterBean));
		
		//-----------------------------------
		
		from("direct:endpoint1")
		.to("log:direct-endpoint1");
		
		from("direct:endpoint2")
		.to("log:direct-endpoint2");
		
		from("direct:endpoint3")
		.to("log:direct-endpoint3");
	}

}
