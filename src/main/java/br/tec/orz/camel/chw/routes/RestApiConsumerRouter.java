package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

import br.tec.orz.camel.chw.model.WorkOrder;

//@Component
public class RestApiConsumerRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
						
		restConfiguration().host("140.238.184.112").port(3000);
		String workOrderId = "A12644";
				
		from("timer:rest-api-consumer?period=10000")
		.setHeader("workOrderId", () -> workOrderId )
		.to("rest:get:/workOrder/{workOrderId}")
		.unmarshal().json(JsonLibrary.Jackson, WorkOrder.class)
		.log("${body}");
		
	}

}
