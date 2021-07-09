package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

import br.tec.orz.camel.chw.model.CurrencyExchange;
import br.tec.orz.camel.chw.strategy.ArrayListAggregationStrategy;

//@Component
public class AggregatePatternRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files/aggregate-json")
		.unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
		.aggregate(simple("${body.to}"), new ArrayListAggregationStrategy())
		.completionSize(3)
		//.completionTimeout(HIGHEST)
		.to("log:aggregate-json");
	}

}
