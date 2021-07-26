package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import br.tec.orz.camel.chw.model.CurrencyExchange;

@Component
public class RestApiToLogRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// @formatter:off
		
		restConfiguration()
			.component("servlet")
			.bindingMode(RestBindingMode.json);

		rest("/currencyExchange")
    		.description("Currency Exchange REST service")
    		.consumes("application/json")
    		.produces("application/json")
    		
    		.get()
        		.description("Find all currencyExchanges")
        		.outType(CurrencyExchange[].class)
        		.responseMessage()
        			.code(200)
        			.message("All currencyExchanges successfully returned")
            .endResponseMessage()
            .to("log:rest-log");
		
		// @formatter:on
	}

}
