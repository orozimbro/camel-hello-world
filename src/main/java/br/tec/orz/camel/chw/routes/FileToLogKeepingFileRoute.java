package br.tec.orz.camel.chw.routes;

import org.apache.camel.builder.RouteBuilder;

//Component
public class FileToLogKeepingFileRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:files/in-keep?noop=true")
		.log("${body}")
		.to("log:file-log");
	}

}
